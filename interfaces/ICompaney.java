package interfaces;

import java.lang.*;

import entity.*;

public interface ICompaney
{
	public void insertInDB(companey c);
	public void deleteFromDB(String Company_id);
	public void updateInDB(companey c);
	public companey searchcompaney(String Company_id);
	public String[][] getAllcompany();
}