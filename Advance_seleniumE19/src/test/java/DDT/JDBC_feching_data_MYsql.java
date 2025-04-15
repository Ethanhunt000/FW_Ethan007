package DDT;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class JDBC_feching_data_MYsql {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	Driver	driverRef=new Driver();

		DriverManager.registerDriver(driverRef);
		
		//step2:- get connect to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdata","root","root");
		
		//step3:- create SQL statement
		Statement state = conn.createStatement();
		String query = "select distinct regNo,firstname,lastname, from employee;";
		
		//step4:-excute statement/query
		ResultSet result = state.executeQuery(query);
		
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		
		//step5:- close the database connection
		conn.close();
		
		
		
		
	}

}
