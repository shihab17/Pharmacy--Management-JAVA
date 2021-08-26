package interfaces;

import java.lang.*;

import entity.*;

public interface IDoctor
{
	public void insertInDB(doctor doc);
	public void deleteFromDB(String doc_ID);
	public void updateInDB(doctor doc);
	public doctor searchDoctor(String doc_ID);
	public String[][] getAlldoctor();
}