package entity;

import java.lang.*;

public class Admin 
{
	private String adminId;
	private String password;
	private int status;
	
	public Admin(){}
	public Admin(String adminId, String password, int status)
	{
		this.adminId = adminId;
		this.password = password;
		this.status = status;
	}
	
	public void setAdminId(String adminId){this.adminId = adminId;}
	public void setPassword(String password){this.password = password;}
	public void setStatus(int status){this.status = status;}
	
	public String getAdminId(){return adminId;}
	public String getPassword(){return password;}
	public int getStatus(){return status;}
}