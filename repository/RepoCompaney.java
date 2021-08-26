package repository;

import java.lang.*;
import java.util.ArrayList;
import entity.*;
import interfaces.*;


public class RepoCompaney implements ICompaney
{
	DatabaseConnection dbc;
	
	public RepoCompaney()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertInDB(companey c)
	{
		String query = "INSERT INTO companeys VALUES ('"+c.getCompany_name()+"','"+c.getCompany_id()+"','"+c.getCompany_Address()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteFromDB(String Company_id)
	{
		String query = "DELETE from companeys WHERE Company_id='"+Company_id+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void updateInDB(companey c)
	{
		String query = "UPDATE companeys SET Company_name='"+c.getCompany_name()+"','"+c.getCompany_id()+"','"+c.getCompany_Address()+")'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public companey searchcompaney(String Company_id)
	{
		companey com = null;
		String query = "SELECT `Company_name`, `Company_id`, `Company_Address` FROM `companey` WHERE `Company_id`='"+Company_id+"';";     
		try
		{
		
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String Company_name = dbc.result.getString("Company_name");
				String Company_id = dbc.result.getString("Company_id");
				String Company_Address = dbc.result.getString("Company_Address");
				
				com = new companey();
				com.setCompany_name(Company_name);
				com.setCompany_id(Company_id);
				com.setCompany_Address(Company_Address);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return com;
	}
	public String[][] getAllcompany()
	{
		ArrayList<companey> ar = new ArrayList<companey>();
		String query = "SELECT * FROM companeys;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String Company_name = dbc.result.getString("Company_name");
				String Company_id = dbc.result.getString("Company_id");
				String Company_Address = dbc.result.getString("Company_Address");
				
				companey c = new companey(Company_name,Company_id,Company_Address);
				ar.add(c);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][3];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((companey)obj[i]).getCompany_name();
			data[i][1] = ((companey)obj[i]).String Company_id();
			data[i][2] = ((companey)obj[i]).getCompany_Address();
			
		}
		return data;
	}
}












































