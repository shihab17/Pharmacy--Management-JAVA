package interfaces;

import java.lang.*;

import entity.*;

public interface IEmployee
{
	public void insertInDB(employee e);
	public void deleteFromDB(String eId);
	public void updateInDB(employee e);
	public employee searchEmployee_e(String eId);
	public String[][] getAllemployee();
}