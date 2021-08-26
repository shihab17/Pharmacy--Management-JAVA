package entity;
import java.lang.*;

public class employee
{

	private String eId;	
	private String eName;	
	private double eSalary;
	private String eDateOfBirth;
	private String eEmail;
	private String eGender;
	private String ePhoneNumber;
	
	
	
	public employee(){}
	public employee(String eId,String eName,double eSalary,String eDateOfBirth,String eEmail,String eGender,String ePhoneNumber)
	{
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDateOfBirth = eDateOfBirth;
		this.eEmail = eEmail;
		this.eGender = eGender;
		this.ePhoneNumber = ePhoneNumber;
		
	}
	
	
	public void seteId(String eId){this.eId = eId;}
	public void seteName(String eName){this.eName = eName;}
	//public void sete_pas(String e_pas){this.e_pas = e_pas;}
	public void seteSalary(double eSalary){this.eSalary = eSalary;}
	public void seteDateOfBirth(String eDateOfBirth){this.eDateOfBirth = eDateOfBirth;}
	public void seteEmail(String eEmail){this.eEmail = eEmail;}
	public void seteGender(String eGender){this.eGender = eGender;}
	public void setePhoneNumber(String ePhoneNumber){this.ePhoneNumber = ePhoneNumber;}
	
	
	
	
	
	
	public String geteId(){return eId;}
	public String geteName(){return eName;}
	public double geteSalary(){return eSalary;}
	public String geteDateOfBirth(){return eDateOfBirth;}
	public String geteEmail(){return eEmail;}
	public String geteGender(){return eGender;}
	public String getePhoneNumber(){return ePhoneNumber;}

	
	
}