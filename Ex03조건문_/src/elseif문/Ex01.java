package elseif문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//다중if문 예제1.
		System.out.print("점수입력: ");
		
		Scanner sc= new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A"+" 입니다.");
		} else if(score>=80) {
			System.out.println("B"+" 입니다.");
		} else if(score>=70){
			System.out.println("C"+" 입니다.");
		} else if(score>=60) {
			System.out.println("D"+" 입니다.");
		} else {
			System.out.println("F"+" 입니다.");
		}		
	}
}
