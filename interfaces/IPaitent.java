package interfaces;

import java.lang.*;

import entity.*;

public interface IPaitent
{
	public void insertInDB(patient p);
	public void deleteFromDB(String  p_Id);
	public void updateInDB(patient p);
	public patient searchPaitent(String p_Id);
	public String[][] getAllpatient();
}