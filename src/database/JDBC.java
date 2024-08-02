package database;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class JDBC {
    public static Connection getConnection(){
	Connection conn = null;
	try 
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());


    	String url = "jdbc:oracle:thin:@localhost:1521:longg";
		String username = "c##220704";
		String password = "1";

		
		conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connect successfully");
		
	}
	catch(SQLException e)
	{
		JOptionPane.showMessageDialog(null, "Failed to connect to the database", "Error", 1);
		return null;
	}
	return conn;
}
}