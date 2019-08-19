package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcDemo1 {
private static Properties properties=null;

static {
	properties=new Properties();
	properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/hr");
	properties.put("USER", "root");
	properties.put("PASSWORD", "root");
}

	public JdbcDemo1() {
	super();
	
	
}



	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register the driver 
		
		/*
		 * DriverManager.registerDriver(new org.h2.Driver());
		 * Class.forName("org.h2.Driver");
		 */
		//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		Connection connection=DriverManager.getConnection(properties.getProperty("JDBC_URL"),properties.getProperty("USER"),properties.getProperty("PASSWORD"));
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from course");
		System.out.println("ID NAME PRICE");
		while(resultSet.next())
		{
			//System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
			System.out.printf("\n%d %s %d", resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3));
		}
		
		
		}

	}


