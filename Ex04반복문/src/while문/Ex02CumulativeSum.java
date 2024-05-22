package while문;

import java.util.Scanner;

public class Ex02CumulativeSum {

	public static void main(String[] args) {

		// __방법 1
		Scanner sc = new Scanner(System.in);
		int sum = 0;

//		while (true) {
//			System.out.print("숫자입력 : ");
//			int input = sc.nextInt();
//			sum += input;
//			System.out.println("누적결과 : " + sum);
//
//			if (input == -1) {
//				break;
//			}		
//		}System.out.print("종료되었습니다.");

		// __방법2
		int input = 0;
		while (input != -1) {
			System.out.print("숫자입력 : ");
			input = sc.nextInt();
			sum += input;
			System.out.println("누적결과 : " + sum);
		}
		System.out.print("종료되었습니다.");
	}
}
