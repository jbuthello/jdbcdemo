package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class save1 {
	
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
	String password="root";
	Connection connection=null;
	
	//Step 1: to load/register the driver using class.forName
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	//Step 2: establish connection using Drivermanager
		
		connection=DriverManager.getConnection(url, username, password);
		
	//Step 3: to create a statement using Statement from java.sql.statement package (interface)
		
		Statement statement=connection.createStatement();
		
		
	//Step 4: to execute statement
		statement.executeUpdate("INSERT INTO pen VALUES(5,'Parker','blue',600)");
		statement.executeUpdate("INSERT INTO pen VALUES(6,'Luxor','red',100)");
		statement.executeUpdate("INSERT INTO pen VALUES(7,'Cello','black',10)");
		statement.executeUpdate("INSERT INTO pen VALUES(8,'Reynolds','green',10)");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// Step 5: Closing the connection
	finally {
		try {
			System.out.println();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
