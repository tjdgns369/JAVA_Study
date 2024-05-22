package ex03objectarraylist;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> books = new ArrayList<>();
	
	
	// 도서 추가 기능 
	public void addBook(Book book) {
		books.add(book);
	}
	
	//도서 검색 기능(제목/ 저자 기준으로)
	public ArrayList<Book> searchBooks(String keyword){
		ArrayList<Book> results = new ArrayList<>();
		//.toLowerCase() -> 대문자를 소문자로 변경하는 메서드 
		for(Book book : books) {
			if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())
					||book.getAuthor().toLowerCase().contains(keyword.toLowerCase())
					) {
				results.add(book);
			}
		}
		return results;
	}
	//도서 정보 삭제
	public void deleteBook(Book book) {
		books.remove(book);
	}
	//전체 도서 정보 출력
	public void printAllBooks() {
		for(Book book:books) {
			System.out.println(book);
		}
	}
	
}
