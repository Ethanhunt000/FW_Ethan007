package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBC_fetching_update_mysql {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		

				// step1:- Register driver/load mysql database
				Driver driverRef = new Driver();

				DriverManager.registerDriver(driverRef);

				// step2:- get connect to database
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdata", "root", "root");

				// step3:- create SQL statement
				Statement state = conn.createStatement();
				String query = "insert into employee values('4','boo','ram','goa')";
				String query1 = "insert into employee values('5','xyz','ibrahim','Gadag')";
				String query2= "insert into employee values('6','abc','ibu','Hubli')";
				int result = state.executeUpdate(query);
				int result2 = state.executeUpdate(query2);
				int result1 = state.executeUpdate(query1);
				if (result == 1 && result2==1 && result1==1) {
					System.out.println("Data is inserted");
				} else {
					System.out.println("Data is not inserted");
				}

				conn.close();
	}

}
