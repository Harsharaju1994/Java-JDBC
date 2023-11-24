package org.in60minutes;

import java.sql.*;
import java.util.Scanner;

public class DeleteData {

//	public static void main(String[] args) {
//		
//		String url = "jdbc:mysql://localhost:3306/javajdbc";
//		String username = "root";
//		String password = "Harsha@1997!";
//		String QUERY = "SELECT no,name,location FROM teacher";
//	      // Open a connection
//	      try(Connection conn = DriverManager.getConnection(url, username, password);
//	         Statement stmt = conn.createStatement();
//	      ) {		      
//	         String sql = "DELETE FROM teacher " +
//	            "WHERE no = 302";
//	         stmt.executeUpdate(sql);
//	         ResultSet rs = stmt.executeQuery(QUERY);
//	         while(rs.next()){
//	            //Display values
//	            System.out.print("ID: " + rs.getInt(1));
//	            System.out.print(", Age: " + rs.getString(2));
//	            System.out.print(", First: " + rs.getString(3));
//	            
//	         }
//	         rs.close();
//	      } catch (SQLException e) {
//	         e.printStackTrace();
//	      } 
//	}
	
	 public static void main(String[] args) throws SQLException
	    {
		 String url = "jdbc:mysql://localhost:3306/javajdbc";
			String username = "root";
			String password = "Harsha@1997!";
			Scanner dot = new Scanner(System.in);
			System.out.println("Enter no...");
        	int no1 = dot.nextInt();
        	
	        Connection con=null;
	        PreparedStatement p=null;
	        con= DriverManager.getConnection(url,username,password);
	        try{
	        	
	            String sql="delete from teacher where no="+no1;
	             p =con.prepareStatement(sql);
	             p.execute();
	        }catch(SQLException  e){
	            System.out.println(e);
	            
	        }
	        System.out.println("Successfully Deleted...");
	    }
	     
}
