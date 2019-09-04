package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysqlconnection { 
	public mysqlconnection() {
		String url = "jdbc:mysql://localhost:3306/canteensystem";
    	String username = "root";
    	String password = "";
    	try{  
    		Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection(url,username,password);  
    		//System.out.println("Connecting to database....");
    		con.close();  
		}catch(Exception e){
			System.out.println(e);
			}  
	}
	
	
	/*
	 * public static void main(String[] args) { String url =
	 * "jdbc:mysql://localhost:3306/canteensystem"; String username = "root"; String
	 * password = ""; //String sql = " SELECT * FROM customer"; //Statement stmt =
	 * null; ResultSet rs;
	 * 
	 * try{ Class.forName("com.mysql.jdbc.Driver"); Connection
	 * con=DriverManager.getConnection(url,username,password);
	 * System.out.println("Connecting to database...."); stmt =
	 * con.createStatement(); rs=stmt.executeQuery(); while(rs.next()) {
	 * System.out.println("Connection Successfull");
	 * //System.out.println(rs.getDate(1) + "\t"+rs.getTime(1)+ "\t " + rs.getInt(2)
	 * + "\t" +rs.getString(3) + "\t " + rs.getString(4) + "\t " + rs.getInt(5) +
	 * " \t" + rs.getInt(6)); } con.close(); }catch(Exception e){
	 * System.out.println(e); } }
	 */ 
 }



    		