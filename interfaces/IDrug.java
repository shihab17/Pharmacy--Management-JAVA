package interfaces;

import java.lang.*;

import entity.*;

public interface IDrug
{
	public void insertInDB(drug d);
	public void deleteFromDB(String d_drug_Id);
	public void updateInDB(drug d);
	public drug searchdrug_d(String d_drug_Id);
	public String[][] getAlldrug();
}