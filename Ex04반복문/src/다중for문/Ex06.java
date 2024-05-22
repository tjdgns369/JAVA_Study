package 다중for문;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 정수 두개를 입력받기. base/n == base^n
		
		Scanner sc = new Scanner(System.in);
		
		//1. base와 n을 입력받는다.ㅣ
		System.out.print("base : ");
		int base = sc.nextInt();
		System.out.print("n : ");
		int n = sc.nextInt();
		
		int result=1;
		for(int i=0; i<n; i++) {
			result *= base; // result /*= base ->슬래쉬뒤까지 연산을 result에 넣는다.
		}
		System.out.println("result : "+result);
	}

}
