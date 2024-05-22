package elseif문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 예제3.
		// 입력:숫자2개 / 문자:1개
		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력: ");
		String Cal = sc.next();

		if (Cal.equals("+")) {
			System.out.println(num1 + Cal + num2 + "=" + num1 + num2);
		} else if (Cal.equals("-")) {
			System.out.println(num1 + Cal + num2 + "=" + (num1 - num2));
		} else if (Cal.equals("*")) {
			System.out.println(num1 + Cal + num2 + "=" + num1 * num2);
		} else if (Cal.equals("/")) {
			System.out.println(num1 + Cal + num2 + "=" + (double) num1 / num2);
		} else {
			System.out.println("잘못된 연산입니다.");
		}
	}
}
