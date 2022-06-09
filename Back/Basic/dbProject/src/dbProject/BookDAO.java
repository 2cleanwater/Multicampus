package dbProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BookDAO {

	public void insertBook(BookDTO bookDTO) throws SQLException {
		String sql = "insert book values" + bookDTO;
		BookTest bt = new BookTest();
		Connection cn = bt.getConnection();
		Statement stmt = cn.createStatement();
		int affectedCount = stmt.executeUpdate(sql);
		if(affectedCount>0) {
			System.out.println("삽입완료");
		} else {
			System.out.println("삽입실패");
		}
	}
	
	public void selectBook() {
		String sql = "select * from book";
		BookTest bt = new BookTest();
		Connection cn = bt.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = cn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.printf("%s %s %s %s %s %s\n",rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				rs.close();
				stmt.close();
				cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void deleteData(String st) throws SQLException {
		String sql = "delete from book where bookNo = "+st;
		BookTest bt = new BookTest();
		Connection cn = bt.getConnection();
		Statement stmt = cn.createStatement();
		int affectedCount = stmt.executeUpdate(sql);
		if(affectedCount>0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		stmt.close();
		cn.close();
	}
}
