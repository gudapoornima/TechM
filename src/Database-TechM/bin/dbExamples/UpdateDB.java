package com.database.examples;
import java.sql.*;

public class UpdateDB {
public static void main(String args[])throws SQLException,Exception{
	//registering the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//establish the connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","admin");
	//use update Query
	PreparedStatement ps = con.prepareStatement("update employee set empName=? where empName=?");
	ps.setString(1, "Deepak");
	ps.setString(2, "Dileep");
	
	int value = ps.executeUpdate();
	System.out.println("Row updated in the Table");	
   }
}