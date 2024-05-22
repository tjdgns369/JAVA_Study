package for문;

public class Ex01OneToTen {

	// for(초기화구문; 조건검사; 반복후작업){
	// 검사조건이 true일 때 실행문;
	// }

	public static void main(String[] args) {
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 21; i <= 57; i+=2) {	
			// for조건에 'i++'를 넣으면 if(i%2!=0) -> 이조건식을 생략할수있다.
				System.out.print(i + " ");		
				
		}
	}
}