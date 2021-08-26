package repository;

import java.lang.*;
import java.util.ArrayList;
import entity.*;
import interfaces.*;

public class RepoDrug implements IDrug
{
	DatabaseConnection dbc;
	
	public RepoDrug()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertInDB(drug d)
	{
		String query = "INSERT INTO drug VALUES ('"+d.getd_drug_name()+"','"+d.getd_drug_Id()+"','"+d.getd_Trade_name()+"','"+d.getd_Company_name+"','"+d.getd_Med_date()+"','"+d.getd_Exp_date()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteFromDB(String d_drug_Id)
	{
		String query = "DELETE from drug WHERE d_drug_Id ='"+d_drug_Id+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void updateInDB(drug d)
	{
		String query = "UPDATE drugs SET d_drug_name='"+d.getd_drug_name()+"','"+d.getd_drug_Id()+"','"+d.getd_Trade_name()+"','"+d.getd_Company_name+"','"+d.getd_Med_date()+"','"+d.getd_Exp_date()+"'";
		try
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public drug searchdrug_d(String d_drug_Id)
	{
		drug drg = null;
		String query = "SELECT `d_drug_Id`, `d_drug_name`, `d_Trade_name`,`d_Company_name`, `d_Med_date`, `d_Exp_date`FROM `drug` WHERE `d_drug_Id`='"+d_drug_Id+"';";     
		try
		{
		
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String d_drug_name = dbc.result.getString("d_drug_name");
				String d_drug_Id = dbc.result.getString("d_drug_Id");
				String d_Trade_name = dbc.result.getString("d_Trade_name");
				String d_Company_name = dbc.result.getString("d_Company_name");
				String d_Med_date = dbc.result.getString("d_Med_date");
				String d_Exp_date = dbc.result.getString("d_Exp_date");
				
				
			
				drg = new drug();
				drg.setd_drug_name(d_drug_name);
				drg.setd_drug_Id(d_drug_Id);
				drg.setd_Trade_name(d_Trade_name);
				drg.setd_Company_name(d_Company_name);
				drg.setd_Med_date(d_Med_date);
				drg.setd_Exp_date(d_Exp_date);
				
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return drg;
	}
	public String[][] getAlldrug();
	{
		ArrayList<drug> ar = new ArrayList<drug>();
		String query = "SELECT * FROM drug;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String d_drug_name = dbc.result.getString("d_drug_name");
				String d_drug_Id = dbc.result.getString("d_drug_Id");
				String d_Trade_name = dbc.result.getString("d_Trade_name");
				String d_Company_name = dbc.result.getString("d_Company_name");
				String d_Med_date = dbc.result.getString("d_Med_date");
				String d_Exp_date = dbc.result.getString("d_Exp_date");
				
				drug d = new drug(d_drug_name,d_drug_Id,d_Trade_name,d_Company_name,d_Med_date,d_Exp_date);
				ar.add(d);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][6];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((drug)obj[i]).getd_drug_name();
			data[i][1] = ((drug)obj[i]).getd_drug_Id();
			data[i][2] = ((drug)obj[i]).getd_Trade_name();
			data[i][3] = ((drug)obj[i]).getd_Company_name();
			data[i][4] = ((drug)obj[i]).getd_Med_date();
			data[i][5] = ((drug)obj[i]).getd_Exp_date();
			
		}
		return data;
	}
}












































