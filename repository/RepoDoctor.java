package repository;

import java.lang.*;
import java.util.ArrayList;
import entity.*;
import interfaces.*;


public class RepoDoctor implements IDoctor
{
	DatabaseConnection dbc;
	
	public RepoDoctor()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertInDB(doctor doc)
	{
		String query = "INSERT INTO doctor VALUES ('"+doc.getdoc_Name()+"','"+doc.getdoc_ID()+"','"+doc.getdoc_Speciality()+"',"+doc.getdoc_Fee()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteFromDB(String doc_ID)
	{
		String query = "DELETE from doctors WHERE doc_ID='"+doc_ID+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void updateInDB(doctor doc)
	{
		String query = "UPDATE doctor SET doctorName='"+doc.getdoc_Name()+"','"+doc.getdoc_ID()+"','"+doc.getdoc_Speciality()+"',"+doc.getdoc_Fee()+"'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public doctor searchDoctor(String doc_ID)
	{
		doctor doct = null;
		String query = "SELECT `doc_Name`, `doc_ID`, `doc_Speciality`, `doc_Fee` FROM `doctor` WHERE `doc_ID`='"+doc_ID+"';";     
		try
		{
		
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String doc_Name = dbc.result.getString("doc_Name");
				String doc_ID = dbc.result.getString("doc_ID");
				String doc_Speciality = dbc.result.getString("doc_Speciality");
				String doc_Fee = dbc.result.getString("doc_Fee");
				
				
				doct = new doctor();
				doct.setdoc_Name(doc_Name);
				doct.setdoc_ID(doc_ID);
				doct.setdoc_Speciality(doc_Speciality);
				doct.setdoc_Fee(doc_Fee);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return doct;
	}
	public String[][] getAlldoctor()
	{
		ArrayList<doctor> ar = new ArrayList<doctor>();
		String query = "SELECT * FROM doctor;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String doc_Name = dbc.result.getString("doc_Name");
				String doc_ID = dbc.result.getString("doc_ID");
				String doc_Speciality = dbc.result.getString("doc_Speciality");
				String doc_Fee = dbc.result.getString("doc_Fee");
				
				doctor doc = new doctor(doc_Name,doc_ID,doc_Speciality,doc_Fee);
				ar.add(doc);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][4];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((doctor)obj[i]).getdoc_Name();
			data[i][1] = ((doctor)obj[i]).getdoc_ID();
			data[i][2] = ((doctor)obj[i]).getdoc_Speciality();
			data[i][3] = (((doctor)obj[i]).getdoc_Fee())+"";
		}
		return data;
	}
}












































