package 조건연산자;

import java.util.Scanner;

public class 홀짝 {

	public static void main(String[] args) {
		// 홀짝
	
	  Scanner sc= new Scanner(System.in);
      System.out.print("정수입력: ");
      int num1=sc.nextInt();
      // 조건 : 2로나눈 나머지값이 0이면 짝수, 1이면 홀수
      System.out.println(num1%2==0?"짝수":"홀수");
	}

}
