package entity;
import java.lang.*;

public class companey
{
	private String Company_name;
	private String Company_id;
	private String Company_Address;

	
	public companey(){}
	public companey(String Company_name,String Company_id,String Company_Address)
	{
		this.Company_name = Company_name;
		this.Company_id= Company_id;
		this.Company_Address = Company_Address;
		
	}
	
	public void setCompany_name(String Company_name){this.Company_name = Company_name;}
	public void setCompany_id(String Company_id){this.Company_id =Company_id;}
	public void setCompany_Address(String Company_Address){this.Company_Address = Company_Address;}
	
	public String getCompany_name(){return Company_name;}
	public String getCompany_id(){return Company_id;}
	public String getCompany_Address(){return Company_Address;}

}