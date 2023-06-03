package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete
{
	public static void main(String[] args)
	{
		String url="jdbc:mysql://localhost:3360/javabatch";
		String username="root";
		String password="root";
		Connection connection=null;
		
		try
		{
//			Step 1: Load/Register the driver using class class and forName static method.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Step 2: Establish Connection
			connection= DriverManager.getConnection(url, username, password);
			
//			Step 3: Create Statement
			Statement statement=connection.createStatement();
			
//			Step 4: Execute Statement
			statement.execute("DELETE FROM pen WHERE ID=4");
			
			System.out.println("Data deleted sucessfully. \n");
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			System.out.println("Connection closed.");
			try
			{
				connection.close();
			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
