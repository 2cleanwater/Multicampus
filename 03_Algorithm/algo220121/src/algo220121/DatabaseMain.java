package algo220121;

import java.sql.SQLException;

public class DatabaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseMain dm = new DatabaseMain();
		dm.testCRUD();
	}
	
	public void testCRUD() {
		EmpDAO dao = new EmpDAO();
		dao.testQueryWithVO();
//		try {
//			//dao.testInsertV2();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
	}


}
