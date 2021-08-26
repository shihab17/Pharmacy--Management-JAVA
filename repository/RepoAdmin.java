package repository;

import java.lang.*;

import entity.*;
import interfaces.*;
public class RepoAdmin implements IAdmin
{
	DatabaseConnection dbc;
	
	public RepoAdmin()
	{
		dbc = new DatabaseConnection();
	}
	
	public Admin getAdmin(String adminId, String pass)
	{
		Admin admin = null;
		String query = "SELECT  adminId, password, status FROM login WHERE adminId='"+adminId+"' AND password='"+pass+"';";
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				admin = new Admin();
				admin.setAdminId(dbc.result.getString("adminId"));
				admin.setPassword(dbc.result.getString("password"));
				admin.setStatus(dbc.result.getInt("status"));
			}
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
		dbc.closeConnection();
		return admin;
	}

}












































