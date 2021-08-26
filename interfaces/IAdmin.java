package interfaces;

import java.lang.*;
import entity.*;

public interface IAdmin
{
	Admin getAdmin(String adminId, String password );
	// public void insertInDB(admin a);
	// public void deleteFromDB(String a_id);
	// public void updateInDB(admin a);
	// public admin searchadmin(String a_id);
	// public String[][] getAlladmin();
}