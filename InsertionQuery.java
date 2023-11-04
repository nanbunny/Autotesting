package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load the db driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connect to the db
		
		String dburl = "jdbc:mysql://localhost:3306/animated movies";
		String username ="root";
		String password ="root";
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		System.out.println("Successfully connected to database");
		
		String query = "INSERT INTO movies('TITLE','Genre','Director','Release_year')";

		// send query to the DB

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {

		System.out.print("Title: " + rs.getString("Title") + "\t");

		System.out.print("Genre:" +rs.getString("Genre") + "\t");

		System.out.print("Director: "+rs.getString("Director") + "\t");

		System.out.println("Release Year: " + rs.getString("Release_year") + "\t");

	}
		con.close();
	}
}






