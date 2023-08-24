package Ex04;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static Connection connect() {
		Connection con=null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "java";
		String password = "pass";
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			System.out.println("");
		}catch(Exception e) {
			System.out.println("DB연결: " + e.toString());
		}
		return con;
	}
}