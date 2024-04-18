package databasepracticesession;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SqlRmgYantra {

	public static void main(String[] args) throws SQLException {
		//step1: Register Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
				
		//step2: get connection for database
		Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
		
		Statement state = con.createStatement();
		String query = "select * from project where lower (Project_Name ='Project_Vaish_2019');";
		
		ResultSet result = state.executeQuery(query);
		System.out.println(result.getMetaData());
		
		while(result.next()) {
			String actual = result.getString(4);
			
			if(actual.contains("Vaish_2019"))
			{
				System.out.println("data is present");
			}else {
				System.out.println("data is not present");
			}
		}
		
		con.close();
	}

}
