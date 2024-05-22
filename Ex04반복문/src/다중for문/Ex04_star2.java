package 다중for문;

public class Ex04_star2 {

	public static void main(String[] args) {
		
		// 공백 0 -> 4까지 1씩 증가
		// 별 5 -> 1까지 1씩 감소
		
		for(int j=1; j<=5; j++) {
					
		  for(int i = 1; i < j; i++) { // 공백을 0개 출력해주는 for문
			 System.out.print(" ");
		  }
		  for(int i = 5; i >= j; i--) { // 별 5개를 출력해주는 for문
			 System.out.print("*");
		  }
		  System.out.println();
		  }
//----------------------------------------------------------------		
//		for(int i = 1; i < 2; i++) { // 공백을 1개 출력해주는 for문
//			System.out.print(" ");
//		}
//		for(int i = 5; i >= 2; i--) { // 별 4개를 출력해주는 for문
//			System.out.print("*");
//		}
//		System.out.println();
////----------------------------------------------------------------		
//		for(int i = 1; i < 3; i++) { // 공백을 2개 출력해주는 for문
//		System.out.print(" ");
//		}
//		for(int i = 5; i >= 3; i--) { // 별 3개를 출력해주는 for문
//		System.out.print("*");
//		}
//		System.out.println();	
////----------------------------------------------------------------		
//		for(int i = 1; i < 4; i++) { // 공백을 3개 출력해주는 for문
//		System.out.print(" ");
//		}
//		for(int i = 5; i >= 4; i--) { // 별 2개를 출력해주는 for문
//		System.out.print("*");
//		}
//		System.out.println();		
//		// 1행
//		//System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		System.out.println(); // 개행을 해줘야 1행을 완료 후
//		                      // 2행으로 넘어간다.
//		
//		// 2행
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		System.out.println();
//		
//		// 3행
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		System.out.println();
//		
//		// 4행
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		
//		System.out.println();
//		
//		// 5행
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		
//		System.out.println();
	}

}
