package ninzaCRM.genericUtlities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection conn =null;
	public void establisedConnection(String url,String susername,String spassword) throws SQLException {
		Driver driverRef= new Driver();
		DriverManager.registerDriver(driverRef);
		conn = DriverManager.getConnection(url, susername, spassword);
		System.out.println("------------------------ database connection done---------------------");
		
	}
	
	public ResultSet fetchDataFromDataBase(String Query) throws SQLException {
		Statement stat= conn.createStatement();
	ResultSet resultSet = stat.executeQuery(Query);
	return resultSet;
	}
	public int insertDataIntoDataBase(String query) throws SQLException {
		Statement stat= conn.createStatement();
		int res = stat.executeUpdate(query);
		return res;
		
	}
	public void closeConnection() throws SQLException {
		conn.close();
		System.out.println("----------------databse connection closed------------------------------");
		
	}

}
