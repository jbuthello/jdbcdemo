package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
	
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root"; String password="root";
	Connection connection=null;
	
	//Step 1: to load/register the driver using class.forName
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	//Step 2: establish connection using Drivermanager
		
		connection=DriverManager.getConnection(url, username, password);
		
	//Step 3: to create a statement using Statement from java.sql.statement package (interface)
		
		Statement statement=connection.createStatement();
		
		
	//Step 4: to execute statement
		int a=statement.executeUpdate("UPDATE pen SET NAME='Trimax',COLOR='Blue' WHERE ID=2");
		if(a>0) {
			System.out.println("Data updated sucessfully.");
		}
		else {
			System.out.println("Data not updated");
		}
		
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

	