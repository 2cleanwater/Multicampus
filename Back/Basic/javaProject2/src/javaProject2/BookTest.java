package javaProject2;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTest test = new BookTest();
		test.test1();
		System.out.println();
		test.test2();
	}
	public void test1() {
		String bookNo1 = "1,자바프로그래밍,홍길동,25000,2021,멀티출판사";
		String bookNo2 = "2,자바스크립트,이몽룡,30000,2020,서울출판사";
		String bookNo3 = "3,HTML/CSS,성춘향,18000,2021,강남출판사";
		
		String[] books = {bookNo1, bookNo2, bookNo3};
		System.out.println("도서번호\t도서명\t\t저자\t가격\t발행일\t출판사");
		System.out.println("-------------------------------------------------------");
		for(String s1 : books) {
			String[] temp1 = s1.split(",");
			String bookTitle = temp1[1];
			String bookAuthor = temp1[2];
			String bookPublisher = temp1[5];
			int bookNo = 0;
			int bookYear = 0;
			int bookPrice = 0;
			try { 
				bookNo = Integer.parseInt(temp1[0]);
				bookYear = Integer.parseInt(temp1[4]);
				bookPrice = Integer.parseInt(temp1[3]);
			} catch(NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
			Book result = new Book(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
			System.out.println(result);
		}
	}
		public void test2() {
			String bookNo1 = "1,자바 월드,홍길동,25000,2021,멀티출판사,5";
			String bookNo2 = "2,웹 월드,이몽룡,30000,2020,서울출판사,7";
			String bookNo3 = "3,게임 월드,성춘향,18000,2021,강남출판사,9";
			
			String[] books = {bookNo1, bookNo2, bookNo3};
			System.out.println("잡지번호\t잡지명\t발행인\t가격\t발행연도\t출판사\t발행월");
			System.out.println("-----------------------------------------------------");
			for(String s2 : books) {
				String[] temp2 = s2.split(",");
				String bookTitle = temp2[1];
				String bookAuthor = temp2[2];
				String bookPublisher = temp2[5];
				int bookNo = 0;
				int bookYear = 0;
				int bookPrice = 0;
				int month = 0;
				try { 
					bookNo = Integer.parseInt(temp2[0]);
					bookYear = Integer.parseInt(temp2[4]);
					bookPrice = Integer.parseInt(temp2[3]);
					month = Integer.parseInt(temp2[6]);
				} catch(NumberFormatException nfe) {
					System.out.println(nfe.getMessage());
				}
				Magazine result = new Magazine(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher,month);
				System.out.println(result);
			}
	}

}
