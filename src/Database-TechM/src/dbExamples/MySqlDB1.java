//To select and display the database rows in the console

package dbExamples;

import java.sql.*;

public class MySqlDB1 {
public static void main(String args[]) throws SQLException,Exception {
	//register the driver to connect to mysql environment
	Class.forName("com.mysql.cj.jdbc.Driver");
	//Establish the connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TechM?autoReconnect=true&useSSL=false","root","admin");
	System.out.println("Connected to Database Successfully");
	//enable the STatement object to pass sql queries.
	Statement stmt = con.createStatement();
	//use the ResultSet
	ResultSet rs = stmt.executeQuery("select * from employee");
	
	//iterate the rows
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	}
	
	rs.close();
	stmt.close();
	con.close();
   }
}
