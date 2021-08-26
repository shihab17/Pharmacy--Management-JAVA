package repository;
import java.sql.*;

public class DatabaseConnection
{
	Connection con;
	Statement st;
	ResultSet result;
	
	public DatabaseConnection()
	{
		
	}

	public void openConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
			st = con.createStatement();
		}
		catch(Exception e){System.out.println("ERROR"+e.getMessage());}
	}
	public void closeConnection()
	{
		try
		{
			if(con!=null){con.close();}
			if(st!=null){st.close();}
			if(result!=null){result.close();}
		}
		catch(Exception e){}
	}
	
}
