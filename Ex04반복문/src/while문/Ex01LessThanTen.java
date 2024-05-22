package while문;

import java.util.Scanner;

public class Ex01LessThanTen {

	public static void main(String[] args) {
		// 사용자입력이 10보다 작은수를 입력받고,10보다 큰수면 "종료되었습니다." 출력
		// 입출력작성하기

		Scanner sc = new Scanner(System.in);

		// System.out.print("정수입력 : ");
		// int num=sc.nextInt();_ 코드 두개를 생략할수 있다.
		// 왜냐하면 num이라는 박스에 0을 넣고 시작 후 비교하기 때문이다.

		// __방법1
//		int num = 0;
//		while (num <= 10) {
//			System.out.print("정수입력 : ");
//			num = sc.nextInt();
//		}

		// __방법2_while문의 조건에 true를 넣어고, if문에 break를 넣는다.
		//        true를 계속실행하되 멈추는 조건을 넣는 방법.
		while (true) {
			System.out.print("정수입력 : ");
			int num = sc.nextInt();
			if (num > 10) {
				break;
			}
		}
		System.out.print("종료되었습니다.");
	}
}
