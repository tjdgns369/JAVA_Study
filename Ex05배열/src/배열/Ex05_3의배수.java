package 배열;

import java.util.Scanner;

public class Ex05_3의배수 {

	public static void main(String[] args) {
		// 숫자를 입력받아 3의 배수인 숫자를 출력하는 프로그램 작성하기.

		// 1. int형 10개 공간을 가진 배열 만들기
		int[] nums = new int[10];

		// 2. 공간의 크기만큼 사용자의 입력을 받기
		Scanner sc = new Scanner(System.in);

		// 3. 입력된 숫자를 하나씩 꺼낼때 3의 배수이면 출력하기

		// 3-1. 숫자를 10번 입력받기_배열에 값을 입력받는 for문
		for (int i = 0; i < nums.length; i++) {
			System.out.print((i + 1) + "번 째 정수 입력>> ");
			nums[i] = sc.nextInt(); //빈 배열에 값을 입력받는다.
		}

		// 3-2. 입력받은 10개의 숫자중에서 3의 배수만 출력을 하기_배열에서 값을 꺼내는 for문
		for (int i = 0; i < nums.length; i++) { // 3의 배수 출력
			if (nums[i] % 3 == 0) {
				System.out.print("3의 배수 : " + nums[i] + " ");
			}

		}
	}
}
