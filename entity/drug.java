package entity;
import java.lang.*;

public class drug
{
private String d_drug_Id;
private String d_drug_name;
private String d_Trade_name;
private String d_Company_name;
private String d_Med_date;
private String d_Exp_date;


public drug(){}
public drug(String d_drug_Id,String d_drug_name, String d_Trade_name, String d_Company_name, String d_Med_date, String d_Exp_date )
{
this.d_drug_Id = d_drug_Id;
this.d_drug_name = d_drug_name;
this.d_Trade_name = d_Trade_name;
this.d_Company_name = d_Company_name;
this.d_Med_date = d_Med_date;
this.d_Exp_date = d_Exp_date;
}

public void setd_drug_Id(String d_drug_Id){this.d_drug_Id = d_drug_Id;}
public void setd_drug_name(String d_drug_name){this.d_drug_name = d_drug_name;}
public void setd_Trade_name(String d_Trade_name){this.d_Trade_name = d_Trade_name;}
public void setd_Company_name(String d_Company_name){this.d_Company_name = d_Company_name;}
public void setd_Med_date(String  d_Med_date){this. d_Med_date =  d_Med_date;}
public void setd_Exp_date(String  d_Exp_date){this. d_Exp_date =  d_Exp_date;}

public String getd_drug_Id(){return d_drug_Id;}
public String getd_drug_name(){return d_drug_name;}
public String getd_Trade_name(){return d_Trade_name;}
public String getd_Company_name(){return d_Company_name;}
public String getd_Med_date(){return d_Med_date;}
public String getd_Exp_date(){return d_Exp_date;}
}

