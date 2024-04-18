package databasepracticesession;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SqlQuery {

	public static void main(String[] args) throws SQLException {
		//step1: Register Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//step2: get connection for database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root1234");
		
		//Step3: Create Statement
		Statement state = con.createStatement();
		String query = "select * from rmg;";
		
		//step4: Execute Query
		ResultSet result = state.executeQuery(query);
		
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		}
		
		//Step5: close the database connection
		con.close();
	}

}
