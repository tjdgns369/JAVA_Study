package switch문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 월을 입력받아 계절을 출력하기 __'switch문'으로 풀이
		// 12~2(겨울), 3~5(봄), 6~8(여름), 9~11(가을)

		Scanner sc = new Scanner(System.in);

		System.out.print("* 월을 입력하세요: ");

		int month = sc.nextInt();
		String season = ""; // 시즌 박스를 만들어 계절을 다양하게 바꾼다.
							// 출력문의 양이 줄어든다.

//				*** switch문의 구조 ***
//		switch(입력받을 내용){
//		case 값중하나 :
//			실행문장;
//			break;
//		case 값중하나 :
//		case 값중하나 :
//		case 값중하나 :
//			
//		default: // ==esle절과 같기 때문에 조건문 없이 출력문을 입력한다.
//			 실행문장
//			 break;
//		
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "잘못된 입력입니다.";
			break;
		}
		if (month > 0 && month < 13) {
			System.out.println(month + "월은" + season + "입니다.");
		} else {
			System.out.println(season);
		}
	}
}
