package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc5 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ey", "root", "");
		Statement st = con.createStatement();
		st.execute("drop table coffee");
	}
}
