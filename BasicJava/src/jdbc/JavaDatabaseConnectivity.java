package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaDatabaseConnectivity {
	// to interact with DataBase without going to SQL directly from Eclipse/Java
	// WE MUST NEED ORACLE JDBC DRIVER
	
	public static void main(String[] args) throws SQLException {
		
//=========Create Connection============
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "admin", "admin");
		
//========Creating a Query/Statement==============
		Statement stmt = con.createStatement();
		String s = "SELECT First_name, salary From HR.employees Where salary>5000 Order By salary";
		
//========Execute the Statement ===========
		ResultSet rs = stmt.executeQuery(s); //if we want to store the data
			while (rs.next()) {					//to get all the data we use while loop
				String fn = rs.getString("First_name");
				int sal = rs.getInt("salary");
				System.out.println(fn+"   "+sal);
			}
		
//========Close connection================
		con.close();
		
		System.out.println("Programe is Completed");
	}


}
