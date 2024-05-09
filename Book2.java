public class Book2{
	
	int bookId;
	String bookName;
	static String publications;
	static
	{
		publications="xyz";
	}
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	public String toString() {
		return bookId+" "+bookName+" "+publications;
	}
	

}