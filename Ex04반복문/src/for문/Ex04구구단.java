package for문;

import java.util.Scanner;

public class Ex04구구단 {

	public static void main(String[] args) {

		//문제4__for문을 활용해서 구구단 2단 출력하기

		//for(int i = 1; i <= 9; i++) {
		//System.out.println(2+"*"+i+"="+(2*i));
		// }
		
		//문제5__ for문을 활용해서 숫자를 입력받아 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int num = sc.nextInt();
		System.out.print("어느 수 출력 : ");
		int num2 = sc.nextInt();
		
		for (int i = 1; i <= num2; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

	}

}
