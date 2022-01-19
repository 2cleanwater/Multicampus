package p220118;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import p220118.GisaDataVO;

public class MysqlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MysqlMain mm = new MysqlMain();
		mm.test1();
//		try {
//			mm.test();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("해당 파일이 없어 DB작업 불가능합니다. "+e.getMessage());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("정상 종료합니다.");
	}
	public void test1() {
		//한줄의 데이터를 생성할 것이다.
		// readyData를 호출하여 100개의 데이터를 가진 list를 가지고 오는 코드 작성
		ArrayList<GisaDataVO> list = null;
		try {
			list = this.readyData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.insertData(list.get(0));
	}
	private ArrayList<GisaDataVO> readyData() throws FileNotFoundException, IOException  {
		// TODO Auto-generated method stub
		ArrayList<GisaDataVO> list = new ArrayList<GisaDataVO>();
		// 파일의 1000라인의 정보를 GisaDataVO를 이용하여 인스턴스로 만들고 ArrayList에 저장
		// 파일에 접속해서 스트림에 연결
		File file = new File("./data/Abc1115.txt");
		FileReader fr = new FileReader(file);
		// 한줄씩 읽기
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		GisaDataVO vo = null;
		while((line=br.readLine())!=null) {
			//한줄을 분석해서
			int stdNo = Integer.parseInt(line.substring(0,6));
			String email = line.substring(6,10);
			int kor = Integer.parseInt(line.substring(10,13).trim());
			int eng = Integer.parseInt(line.substring(13,16).trim());
			int math = Integer.parseInt(line.substring(16,19).trim());
			int sci = Integer.parseInt(line.substring(19,22).trim());
			int hist = Integer.parseInt(line.substring(22,25).trim());
			int total = Integer.parseInt(line.substring(25,28).trim());
			String mgrCode = line.substring(28,29);
			String accCode = line.substring(29,30);
			String locCode = line.substring(30,31);
			// VO객체에 할당하고 
			vo = new GisaDataVO();
			vo.setStdNo(stdNo);
			vo.setEmail(email);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			vo.setSci(sci);
			vo.setHist(hist);
			vo.setTotal(total);
			vo.setMgrCode(mgrCode);
			vo.setAccCode(accCode);
			vo.setLocCode(locCode);
			//리스트에 저장(리스트는 이미 존재해야 함)
			list.add(vo);
		}
		br.close();
		fr.close();
		return list;
	}
	public void insertData(GisaDataVO vo) {
		//긴 쿼리를 구성하는 방법
		//query를 구성하는 방법에 대한 솔루션
		StringBuffer sql = new StringBuffer("insert into gisaTBl values(");
		sql.append(vo.getStdNo()+",'");
		sql.append(vo.getEmail()+"',");
		sql.append(vo.getKor()+",");
		sql.append(vo.getEng()+",");
		sql.append(vo.getMath()+",");
		sql.append(vo.getSci()+",");
		sql.append(vo.getHist()+",");
		sql.append(vo.getTotal()+",'");
		sql.append(vo.getMgrCode()+"','");
		sql.append(vo.getAccCode()+"','");
		sql.append(vo.getLocCode());
		sql.append(")");
		System.out.println(sql.toString());
	}
	public void test() throws ClassNotFoundException, SQLException {
		//서버접속에 필요한 정보
		String url = "jdbc:mysql://localhost:3306/shopdb";
		//접속한 뒤에 작업을 하기 위해 필요한 라이브러리 클래스
		String driver = "com.mysql.jdbc.Driver";
		// 아이디
		String id = "root";
		//비번
		String pwd = "mcys1309";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,id,pwd);
		
		if(con!=null) {
			System.out.println("connected");
			con.close();
		} else {
			System.out.println("fail connection");
		}	
	}

}
