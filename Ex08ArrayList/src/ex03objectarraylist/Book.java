package ex03objectarraylist;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private int pubYear;
	private int price;
	
	
	//생성자 (마우스 우클릭 -> 소스 -> Generate constructor using field클릭
	public Book(String title, String author, String publisher, int pubYear, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pubYear = pubYear;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public String getPublisher() {
		return publisher;
	}


	public int getPubYear() {
		return pubYear;
	}


	public int getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", pubYear=" + pubYear
				+ ", price=" + price + "]";
	}
	
	
	
	
	
}
