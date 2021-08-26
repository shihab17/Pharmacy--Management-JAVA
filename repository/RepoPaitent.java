package repository;

import java.lang.*;
import java.util.ArrayList;
import entity.*;
import interfaces.*;


public class RepoPaitent implements IPaitent
{
	DatabaseConnection dbc;
	
	public RepoPaitent()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertInDB(patient p)
	{
		String query = "INSERT INTO patient VALUES ('"+p.getp_Name()+"','"+p.getp_Id()+"','"+p.getp_pas()+"','"+p.getp_Phone_number()+"','"+p.p_getage()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteFromDB(String  p_Id)
	{
		String query = "DELETE from employees WHERE empId='"+p_Id+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void updateInDB(patient p)
	{
		String query = "UPDATE patient SET patientName='"+p.getp_Name()+"','"+p.getp_Id()+"','"+p.getp_pas()+"','"+p.getp_Date_of_birth()+"','"+p.getp_Phone_number()+"','"+p.p_getage()+"'";
		try
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public public patient searchPaitent(String p_Id);
	{
		Employee pati = null;
		String query = "SELECT `p_Name`, `p_Id`, `p_pas`,`p_Date_of_birth`, `p_gender`, `p_Phone_number`, `p_age` FROM `patient` WHERE `p_Id`='"+p_Id+"';";     
		try
		{
		
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String p_Name = dbc.result.getString("p_Name");
				String p_Id = dbc.result.getString("p_Id");
				String p_pas = dbc.result.getString("p_pas");
				String p_Date_of_birth = dbc.result.getString("p_Date_of_birth");
				String p_gender = dbc.result.getString("p_gender");
				String p_Phone_number = dbc.result.getString("p_Phone_number");
				double p_age = dbc.result.getDouble("p_age");
				
			
				pati = new patient();
				pati.setp_Name(p_Name);
				pati.setp_Id(p_Id);
				pati.setp_pas(p_pas);
				pati.setp_Date_of_birth(p_Date_of_birth);
				pati.setp_gender(p_gender);
				pati.setp_Phone_number(p_Phone_number);
				pati.setp_age(p_age);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return pati;
	}
	 public String[][] getAllpatient()
	{
		ArrayList<patient> ar = new ArrayList<patient>();
		String query = "SELECT * FROM patient;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String p_Name = dbc.result.getString("p_Name");
				String p_Id = dbc.result.getString("p_Id");
				String p_pas = dbc.result.getString("p_pas");
				String p_Date_of_birth = dbc.result.getString("p_Date_of_birth");
				String p_gender = dbc.result.getString("p_gender");
				String p_Phone_number = dbc.result.getString("p_Phone_number");
				double p_age = dbc.result.getDouble("p_age");
				
				patient p = new employee(p_Name,p_Id,p_pas,p_Date_of_birth,p_gender,p_Phone_number,p_age);
				ar.add(p);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((patient)obj[i]).getp_Name();
			data[i][1] = ((epatient)obj[i]).getp_Id();
			data[i][2] = ((patient)obj[i]).getp_pas();
			data[i][3] = ((patient)obj[i]).getp_Date_of_birth();
			data[i][4] = ((patient)obj[i]).getp_gender();
			data[i][5] = ((patient)obj[i]).getp_Phone_number();
			data[i][6] = (((patient)obj[i]).getp_age())+"";
		}
		return data;
	}
}












































