package doWhile문;

import java.util.Scanner;

public class Ex03Diet {

	public static void main(String[] args) {

		// 현재 몸무게를 담는 변수
		int pw;
		// 목표 몸무게를 담는 변수
		int gw;
		// 주차마다 뺀 몸무게을 담는 변수
		int wei;
		// 주차를 샐 수 있는 변수
		int num = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		pw = sc.nextInt();
		System.out.print("목표몸무게 : ");
		gw = sc.nextInt();
		
		//do-while로 문제풀이
		do {
			System.out.print(++num + "주차 감량 몸무게 : ");
			wei = sc.nextInt();

			pw -= wei;

		} while (pw >= gw);

		System.out.println(pw + "kg 달성! 축하합니다!");
		
		//while문으로 문제풀기
	
//		while (pw >= gw) {
//			//num++;__이렇게 선언하고, 시스템문안에 num을 넣어도 되고,
//			//시스템문 안에 ++num으로 넣고 돌려도 값은 나온다.
//			System.out.print(++num + "주차 감량 몸무게 : ");
//			wei = sc.nextInt();
//			pw -= wei;
//		}
//		System.out.println(pw + "kg 달성!! 축하합니다.");

	}
}


