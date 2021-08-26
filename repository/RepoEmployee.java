package repository;

import java.lang.*;
import java.util.ArrayList;
import entity.*;
import interfaces.*;


public class RepoEmployee implements IEmployee
{
	DatabaseConnection dbc;
	
	public RepoEmployee()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertInDB(employee e)
	{
		String query = "INSERT INTO employees VALUES ('"+e.geteId()+"','"+e.geteName()+"','"+e.geteSalary()+"','"+e.geteDateOfBirth()+"','"+e.geteEmail()+"','"+e.geteGender()+"','"+e.getePhoneNumber()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteFromDB(String eId)
	{
		String query = "DELETE from employees WHERE eId='"+eId+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void updateInDB(employee e)
	{
		String query = "UPDATE employees SET employeeName='"+e.geteId()+"','"+e.geteName()+"','"+e.geteSalary()+"','"+e.geteDateOfBirth()+"','"+e.geteEmail()+"','"+e.geteGender()+"','"+e.getePhoneNumber()+"'";
		
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public employee searchEmployee(String eId)
	{
		employee emp = null;
		String query = "SELECT * FROM `employees` WHERE `eId`='"+eId+"';";   //`eId`,`eName`,`eSalary`, `eDateOfBirth`,`eEmail`,`eGender`, `ePhoneNumber`, `e_email`, `e_Blood_group`, `e_age`  
		try
		{
		
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String eId = dbc.result.getString("eId");
				String eName = dbc.result.getString("eName");
				double eSalary = dbc.result.getDouble("eSalary");
				String eDateOfBirth= dbc.result.getString("eDateOfBirth");
				String eEmail = dbc.result.getString("eEmail");
				String eGender = dbc.result.getString("eGender");
				String ePhoneNumber = dbc.result.getString("ePhoneNumber");
				
			
				emp = new employee();
				emp.seteId(eId);
				emp.seteName(eName);
				emp.seteSalary(eSalary);
				emp.seteDateOfBirth(eDateOfBirth);
				emp.seteEmail(eEmail);
				emp.seteGender(eGender);
				emp.setePhoneNumber(ePhoneNumber);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return emp;
	}
	public String[][] getAllemployee();
	{
		ArrayList<employee> ar = new ArrayList<employee>();
		String query = "SELECT * FROM employees;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String eId = dbc.result.getString("eId");
				String eName = dbc.result.getString("eName");
				double eSalary = dbc.result.getDouble("eSalary");
				String eDateOfBirth= dbc.result.getString("eDateOfBirth");
				String eEmail = dbc.result.getString("eEmail");
				String eGender = dbc.result.getString("eGender");
				String ePhoneNumber = dbc.result.getString("ePhoneNumber");
				
				employee e = new employee(eId,eName,eSalary,eDateOfBirth,eEmail,eGender,ePhoneNumber);
				ar.add(e);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][7];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((employee)obj[i]).geteId();
			data[i][1] = ((employee)obj[i]).geteName();
			data[i][2] = (((employee)obj[i]).geteSalary())+"";
			data[i][3] = ((employee)obj[i]).geteDateOfBirth();
			data[i][4] = ((employee)obj[i]).geteEmail();
			data[i][5] = ((employee)obj[i]).geteGender();
			data[i][6] = ((employee)obj[i]).getePhoneNumber();
			//data[i][9] = (((employee)obj[i]).gete_age())+"";
		}
		return data;
	}
}












































