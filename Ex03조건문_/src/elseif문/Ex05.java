package elseif문;

import java.util.Scanner;

public class Ex05 {

	// 월을 입력받아 계절을 출력하기__'if else문'으로 풀이
	// 12~2(겨울), 3~5(봄), 6~8(여름), 9~11(가을)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();
		
		// month가 12 또는 1 또는 2이면 겨울이다.
		
		String season ="";
		//int(num1)=null; -> int는 null을 가질 수 없다.0이 아니기때문!!
		
		if (month == 12 || month == 1 || month ==2) {
			season="겨울";
		} else if (month == 3 || month == 4 || month == 5) {
			season="봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season="여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season="가을";
		} else {
			season="잘못된 입력";
		} 
		System.out.println(month+"월은 "+season+"입니다.");
	}
}
