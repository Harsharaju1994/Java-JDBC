package org.in60minutes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcContext {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/javajdbc";
		String username = "root";
		String password = "Harsha@1997!";
		String query = "select * from teacher";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
			System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
		
		st.close();
		con.close();
	}
}
