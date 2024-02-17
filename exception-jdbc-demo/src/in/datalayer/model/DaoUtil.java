package in.datalayer.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoUtil {

	   String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	   String DB_URL = "jdbc:mysql://192.168.1.44:3306/desker_dev";
	   String USER = "dbuser";
	   String PASS = "Adin@1234";
	   Connection conn = null;
	   PreparedStatement  pStmt = null;

	public DaoUtil( ) {

	}

	public void initJDBC()  {
		try {
		Class.forName("com.mysql.jdbc.Driver");
     conn = DriverManager.getConnection(DB_URL, USER, PASS);
     System.out.println("Connected database successfully...");
		}catch(Exception ex) {
			System.out.println("JDBC Conn error : " + ex);
		}
	}

	public void addNewsUser(NewsUser user) throws SQLException {
		initJDBC();
		String sql = "insert into news_user (user_name, mobile_no, email_id, plan_name) values(?, ?, ?, ?)";
		pStmt  = conn.prepareStatement(sql);
		pStmt.setString(1, user.getUserName());
		pStmt.setString(2, user.getMobileNo());
		pStmt.setString(3, user.getEmailId());
		pStmt.setString(4, user.getPlanName());
		pStmt.execute();

		conn.close();
	}

}
