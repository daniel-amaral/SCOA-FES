package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {

	private Connection connect;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/scoa";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "1234";
	
	
	private void initConnection(){
		
		try{
			// This will load the MySQL driver, each DB has its own driver
			Class.forName(JDBC_DRIVER).newInstance();
			
			// Setup the connection with the DB
			connect = DriverManager
					.getConnection(DB_URL, USER, PASS);
			
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
		} catch (ClassNotFoundException | SQLException |
				 IllegalAccessException | InstantiationException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro no estabelecimento da conexão.");
			e.printStackTrace();
		} 		
	}
	
	
	private void writeResultSet(ResultSet resultSet) throws SQLException {
	    // ResultSet is initially before the first data set
	    while (resultSet.next()) {
	      // It is possible to get the columns via name
	      // also possible to get the columns via the column number
	      // which starts at 1
	      // e.g. resultSet.getSTring(2);
	      String matricula = resultSet.getString("matricula");
	      String senha = resultSet.getString("senha");
	      System.out.println("Matricula: " + matricula);
	      System.out.println("Senha: " + senha);
	    }
	  }
	
	private void writeMetaData(ResultSet resultSet) throws SQLException {
	    //   Now get some metadata from the database
	    // Result set get the result of the SQL query
	    
	    System.out.println("The columns in the table are: ");
	    
	    System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
	    for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
	      System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
	    }
	  }
	
	
	public void readDataBase() throws SQLException{
			
			initConnection();
			
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from scoa.login");
			writeResultSet(resultSet);
			
			 // PreparedStatements can use variables and are more efficient
		      preparedStatement = connect
		          .prepareStatement("insert into  scoa.password values (user1, 12345678)");
		      // "matricula, password from scoa.password");
		      // Parameters start with 1
//		      preparedStatement.setString(1, "user2");
//		      preparedStatement.setString(2, "87654321");
//		      preparedStatement.executeUpdate();

		      preparedStatement = connect
		          .prepareStatement("SELECT matricula, senha from scoa.login");
		      resultSet = preparedStatement.executeQuery();
		      writeResultSet(resultSet);

		      // Remove again the insert comment
//		      preparedStatement = connect
//		      .prepareStatement("delete from feedback.comments where myuser= ? ; ");
//		      preparedStatement.setString(1, "Test");
//		      preparedStatement.executeUpdate();
		      
		      resultSet = statement.executeQuery("select * from scoa.login");
		      writeMetaData(resultSet);
		      
		      
		      String command;
		      System.out.println("Inserting records in DB...");
		      command = "insert into scoa.login " +
		      			"values ('user2', '12345678');";
		      statement.executeUpdate(command);
		      System.out.println("Insertion completed!");
		      
	}
}
