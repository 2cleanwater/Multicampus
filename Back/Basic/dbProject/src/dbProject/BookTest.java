package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO bd = new BookDAO();
		//입력데이터
		BookDTO bookDTO = new BookDTO("B004","자바스크립트","강길동",2020,28000,"서울출판사");
		try {
			bd.insertBook(bookDTO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			bd.deleteData("'B004'");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		bd.selectBook();
	}
	
	public Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/shopdb";
		String driver = "com.mysql.cj.jdbc.Driver";
		String id = "root";
		String pwd = "mcys1309";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
