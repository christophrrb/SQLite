import java.sql.*;

public class SQLDBConnection {
	public static void main(String[] args) {
		
		Connection c = null;

		try {
			Class.forName("org.sqlite.JDBC"); //Calls this class, and this class creates a Driver.
			c = DriverManager.getConnection("jdbc:sqlite:test.db"); //DriverManager gets the created Driver and uses it to return a Connection.
			System.out.println("Opened database succesfully!");

			//Create table
			Statement stmt = c.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS user(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
				"name TEXT NOT NULL," +
				"fav_color TEXT NOT NULL)";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
			System.out.println("Table created!");
		} catch (Exception e) {
			System.err.println("The database could not be created.");
			e.printStackTrace();
		}		
	}
}
