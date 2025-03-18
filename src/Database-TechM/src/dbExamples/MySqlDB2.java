//to connect to a database and insert a row statistically

package dbExamples;
import java.sql.*;

public class MySqlDB2 {

		public static void main(String[] args) throws SQLException, Exception, ClassNotFoundException{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","admin");
		System.out.println("Connected to Database Successfully");

		Statement stmt = con.createStatement();
		
		int result = stmt.executeUpdate("insert into employee(empId, empName, empSal) values('106','Rohan','15000')");
		
		if (result>0)
			System.out.println("Row inserted successfully");
		else 
			System.out.println("Could not insert row");
		ResultSet rs=stmt.executeQuery("Select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		con.close();
		stmt.close();
		rs.close();
		}
		catch(SQLException e) {
			System.out.println("Error in connecting to the database"+e.getMessage());
		}	
	}
}


      