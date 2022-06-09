package p220112;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileTest ft = new FileTest();
		try {
			ft.testFileCopy();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일 찾을 수 없음 : 메인에서 처리");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test() {
		//File 인스턴스 생성
		File file = new File("./data/Abc1115.txt");
		
		if(file.exists()) {
			System.out.printf("file name is %s %n",file.getName());
			System.out.printf("file size is %d bytes %n",file.length());
		} else {
			System.out.println("file is not exist!");
		}
	}
	
	public void testFileReader() throws FileNotFoundException, IOException {
		//Abc1115.txt에 연결하는 File 인스턴스 생성하시오
		File file = new File("./data/Abc1115.txt");
		FileReader fr = new FileReader(file);
		//BufferedReader 인스턴스 만드세요
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
	
	public void testFileCopy() throws FileNotFoundException, IOException {
		//Abc1115.txt에 연결하는 File 인스턴스 생성하시오
		File file = new File("./data/Abc1115.txt");
		File destFile = new File("./data/CopyAbc1115.txt");
		
		FileReader fr = new FileReader(file);
		//BufferedReader 인스턴스 만드세요
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(destFile);
		
		PrintWriter pw = new PrintWriter(fw);
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
			pw.println(line);
		}
		br.close();
		fr.close();
		pw.close();
		fw.close();
	}
	
	public void testFileReaderV2() {
		//Abc1115.txt에 연결하는 File 인스턴스 생성하시오
		File file = new File("./data/Abc1116.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 파일을 찾을 수 없습니다.");
			//e.printStackTrace();
		}
	}

}
