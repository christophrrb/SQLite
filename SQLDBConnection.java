import java.sql.*;

public class SQLDBConnection {
	public static void main(String[] args) {
		
		Connection c = null;

		try {
			Class.forName("org.sqlite.JDBC"); //Calls this class, and this class creates a Driver.
			c = DriverManager.getConnection("jdbc:sqlite:test.db"); //DriverManager gets the created Driver and uses it to return a Connection.
			System.out.println("Opened database succesfully!");
		} catch (Exception e) {
			System.err.println("The database could not be created.");
			e.printStackTrace();
		}		
	}
}
