package javaProject2;
public class Magazine extends Book{
	protected int month;
	
	public Magazine(int bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.month = month;
	}

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = bookNo + bookTitle + bookAuthor + bookPrice + bookYear + bookPublisher + month;
		result = String.format("M%03d\t%s\t%s\t%d\t%d\t%s\t%3d",bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher, month);
		return result;
	}	
	

}
