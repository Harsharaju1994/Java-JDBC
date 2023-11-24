package org.in60minutes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/javajdbc";
		String username = "root";
		String password = "Harsha@1997!";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter no...");
		int s1 = sc.nextInt();
		
		System.out.println("Please Enter name...");
		String s2 = sc.next();
		
		System.out.println("Please Enter location...");
		String s3 = sc.next();
		
		String query = "insert into teacher values(?,?,?)";
		
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(url,username,password);  
		  
		PreparedStatement stmt=con.prepareStatement(query); 
		stmt.setInt(1, s1);
		stmt.setString(2, s2);
		stmt.setString(3, s3);
		
		int rs=stmt.executeUpdate();  
		
		System.out.println("data is added...");
		stmt.close();
		//con.close();
		
		
	}

}
