package task23;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws SQLException {
		
		
		//Database connection details
		
		String db_url="jdbc:mysql://localhost:3306/";
		String userName ="root";
		String password = "3306";
		
		
		
		//Establishing database connection
		Connection connection = DriverManager.getConnection(db_url, userName, password);
		
		if(connection != null) {
			System.out.println("\nDatabase connection Success");
		}else {
			System.out.println("\nDatabase connection Failed");
		}
		
		//to perform operation
		Statement  statement = connection.createStatement();
		
		//creating database
		String create_db ="create database Employee1";
		
		//use the database
		String use_db = "use Employee1";
		
		//creating the table
		String create_table ="create table empdata ("
				                                    + "empcode int,"
				                                    + "empname varchar(15),"
				                                    + "emppage int,"
				                                    + "esalary bigint)";
		
		//inserting values to the table
		String insert_values = "insert into empdata values "
				                                               + "(101,'Jenny',25,10000),"
				                                               + "(102,'Jacky',30,20000),"
				                                               + "(103,'Joe  ',20,40000),"
				                                               + "(104,'John ',40,80000),"
				                                               + "(105,'Shameer',25,90000)";
		//Executing the query
		statement.execute(create_db);
		statement.execute(use_db);
		statement.execute(create_table);
		statement.executeUpdate(insert_values);
				                                               
		
		//Selecting all values in table
		String select = "select * from empdata";
		
		//executing the select query 
		ResultSet selecttable = statement.executeQuery(select);
		   
		//Printing the values
		 while(selecttable.next()) 
		 {
			  System.out.println(selecttable.getInt("empcode")+ "   " + selecttable.getString("empname")+"     "+ selecttable.getInt("emppage")+"      "+selecttable.getInt("esalary"));
		  }
		
		
		//close the JDBC connection
		connection.close();
				

	}

}