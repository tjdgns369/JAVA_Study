package ex03objectarraylist;

public class Main {

	public static void main(String[] args) {
		//도서 관리 프로그램 작성하기.
		// 도서 정보를 포함하는 Book 클래스와, 도서 객체 배열을 사용하여 도서관리 프로그램 만들기
		// Book 클래는 제목,저자,출판사,출판연도, 가격을 포함함.
		// 구현되어야할 기능
		// 1. 도서 정보 추가
		// 2. 도서 정보 검색(제목이나 저자로 검색하기)
		// 3. 도서 정보 삭제
		// 4. 모든 도서 정보 출력.
		
		Book book1= new Book("JAVA Programming","황기태", "생능출판사", 2018, 33000);
		Book book2= new Book("JAVA의 정석","남궁성", "도우출판", 2016, 27000);
		Book book3= new Book("Do it! 점프 투 파이썬","박응용", "이지스퍼블리싱", 2023, 19800);
		
		Library lib = new Library();
		System.out.println("전체 책 입력 및 출력하기 ");
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		
		lib.printAllBooks();
		System.out.println();
		System.out.println("java책 추려내기");
		System.out.println(lib.searchBooks("java"));
		
		System.out.println();
		System.out.println("책 지우고 출력하기 ");
		lib.deleteBook(book1);
		lib.printAllBooks();
	}

}

