package org.eclipse.wb.swing;
import java.sql.*;
import javax.swing.*;

public class sqLiteConnection {
	Connection con = null;
	public static Connection dbConnection() {	
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/tqanh/Documents/Eclipse_java/workspace/EmployeeData.sqlite");
			JOptionPane.showMessageDialog(null, "successfully connection");
			return con;
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
