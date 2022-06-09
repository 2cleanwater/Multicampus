package javaProject2;

public class Book {
	protected int bookNo;
	protected String bookTitle;
	protected String bookAuthor;
	protected int bookYear;
	protected int bookPrice;
	protected String bookPublisher;
	
	public Book(int bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = bookNo + bookTitle + bookAuthor + bookPrice + bookYear + bookPublisher;
		result = String.format("B%03d\t%s\t%s\t%d\t%d\t%s",bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		return result;
	}
	
	
}
