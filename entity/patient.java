package entity;
import java.lang.*;

public class patient
{
	private String p_Name;	
	private String Fathers_Name;
	private String Mothers_Name;
	private String Date_of_birth;
	private String Place_of_birth;
	private String Address;
	private String gender;
	private String Occupation;
	private String Phone_number;
	private String email;
	private String Voter_id;
	private String Blood_group;
	private String Married_status;
	private double age;
	
	public patient(){}
	public patient(String p_Name,String Fathers_Name,String Mothers_Name,String Date_of_birth,String Place_of_birth,String Address,String gender,String Occupation,String Phone_number,String email,String Voter_id,String Blood_group,String Married_status,double age)
	{
		this.p_Name = p_Name;
		this.Fathers_Name = Fathers_Name;
		this.Mothers_Name = Mothers_Name;
		this.Date_of_birth = Date_of_birth;
		this.Place_of_birth = Place_of_birth;
		this.Address = Address;
		this.Occupation = Occupation;
		this.Phone_number = Phone_number;
		this.email = email;
		this.Voter_id = Voter_id;
		this.Blood_group = Blood_group;
		this.Married_status = Married_status;
		this.age = age;
	}
	
	public void setp_Name(String p_Name){this.p_Name = p_Name;}
	public void setFathers_Name(String Fathers_Name){this.Fathers_Name = Fathers_Name;}
	public void setMothers_Name(String Mothers_Name){this.Fathers_Name = Fathers_Name;}
	public void setDate_of_birth(String Date_of_birth){this.Date_of_birth = Date_of_birth;}
	public void setPlace_of_birth(String Place_of_birth){this. Place_of_birth = Place_of_birth;}
	public void setAddress(String Address){this.Address = Address;}
	public void setOccupation(String Occupation){this.Occupation = Occupation;}
	public void setPhone_number(String Phone_number){this.Phone_number = Phone_number;}
	public void setemail(String email){this.email = email;}
	public void setVoter_id(String Voter_id){this.Voter_id = Voter_id;}
	public void setBlood_group(String Blood_group){this.Blood_group = Blood_group;}
	public void setMarried_status(String Married_status){this.Married_status = Married_status;}
	public void setage(double age){this.age = age;}
	
	
	
	public String getp_Name(){return p_Name;}
	public String getFathers_Name(){return Fathers_Name;}
	public String getMothers_Name(){return Fathers_Name;}
	public String getDate_of_birth(){return Date_of_birth;}
	public String getPlace_of_birth(){return Place_of_birth;}
	public String getAddress(){return Address;}
	public String getOccupation(){return Occupation;}
	public String getPhone_number(){return Phone_number;}
	public String getemail(){return email;}
	public String getVoter_id(){return Voter_id;}
	public String getBlood_group(){return Blood_group;}
	public String getMarried_status(){return Married_status;}
	public double getage(){return age;}
	
	
}