package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class LoginCtrl {

	// JDBC driver name and database URL
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	private static final String DB_URL = "jdbc:mysql://localhost/scoa";

	//  Database credentials
	private static final String USER = "root";
	private static final String PASS = "1234";
	
	// Variables for DB connection
	private Connection connect;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	
	/** Class for creating the connection with the DB */
	private void init(){
		System.out.println("iniciou");
		try{
		// This will load the MySQL driver, each DB has its own driver
		Class.forName(JDBC_DRIVER).newInstance();
		
		// Setup the connection with the DB
		connect = DriverManager.getConnection(DB_URL, USER, PASS);
		
		// Statements allow to issue SQL queries to the database
		statement = connect.createStatement();
		
		} catch (ClassNotFoundException | SQLException |
				 IllegalAccessException | InstantiationException e) {
			System.out.println("Erro no estabelecimento da conexão.");
			e.printStackTrace();
		} 		
	}
	
	public boolean login(String matricula, String senha){
		init();
		matricula = matricula.toLowerCase();
		try{
			String command = "SELECT senha FROM scoa.login WHERE matricula='"
					 + matricula + "';";
			resultSet = statement.executeQuery(command);
			if(resultSet.next()){
				String senhaNoDb = resultSet.getString("senha");
				if(senha.matches(senhaNoDb))
					return true;
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	
	public String checkCategoria(String matricula){
		init();
		matricula = matricula.toLowerCase();
		try{
			String command = "SELECT categoria FROM scoa.login WHERE matricula='"
					 + matricula + "';";
			resultSet = statement.executeQuery(command);
			String categoria="";
			if(resultSet.next())
				categoria = resultSet.getString("categoria");
			return categoria;
		} catch(SQLException e){
			return null;
		}
	}
	
	public boolean createLogin(String matricula, String senha, String categoria)
			throws MySQLIntegrityConstraintViolationException {
		init();
		matricula = matricula.toLowerCase();
		categoria = categoria.toLowerCase();
		try{
			String command = "insert into scoa.login " +
			"values ('"+ matricula + "', '" + senha + "', '" + categoria + "');";
			statement.executeUpdate(command);
			System.out.println("Insertion completed!");
			return true;
		} catch(MySQLIntegrityConstraintViolationException e){
			throw new MySQLIntegrityConstraintViolationException();
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteLogin(String matricula, String senha){
		init();
		matricula = matricula.toLowerCase();
		try{
			if(login(matricula, senha)){
				String command = "DELETE FROM scoa.login WHERE matricula='" + matricula + "';";
				statement.executeUpdate(command);
				System.out.println("Record with matricula("+matricula+") deleted.");
				return true;
			} else
				return false;
		} catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean changePassword(String matricula, String senhaAtual, String senhaNova){
		init();
		matricula = matricula.toLowerCase();
		try{
			if(login(matricula, senhaAtual)){
				String command = "UPDATE scoa.login SET senha='" + senhaNova +
								  "' WHERE matricula='" + matricula + "';";
				statement.executeUpdate(command);
				return true;
			} else
				return false;
		} catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	

}
