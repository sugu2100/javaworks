package arraysample;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {} //����ϴ� �ʿ��� ȣ���ϸ� ����ؾ� ��
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
}
