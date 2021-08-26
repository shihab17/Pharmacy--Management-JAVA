package entity;

import java.lang.*;

public class doctor
{
	private String doc_Name;
	private String doc_ID;
	private String doc_Speciality;
	private double doc_Fee;
	
	public doctor(){}
	public doctor(String doc_Name,String doc_ID,String doc_Speciality , double doc_Fee)
	{
		this.doc_Name = doc_Name;
	    this.doc_ID = doc_ID;
		this.doc_Speciality = doc_Speciality;
		this.doc_Fee = doc_Fee;
	}
	
	public void setDocName(String doc_Name) 
	{
		this.doc_Name = doc_Name;
	}
	public void setdoc_ID(String doc_ID)
	{
		this.doc_ID = doc_ID;
	}
	public void setdoc_Speciality(String doc_Speciality)
	{
		this.doc_Speciality = doc_Speciality;
	}
	public void doc_Fee(double doc_Fee)
	{
		this.doc_Fee = doc_Fee;
	}
	
	
	
	public String getdoc_Name()
	{
		return doc_Name;
	}
	public String getdoc_ID()
	{
		return doc_ID;
	}
	public String getdoc_Speciality()
	{
		return doc_Speciality;
	}
	public double getdoc_Fee()
	{
		return doc_Fee;
	}
	
}