package while문;

import java.util.Random;
import java.util.Scanner;

public class Ex05_UpDownGame {

	public static void main(String[] args) {
		// 게임시작기능.
		// 숫자 1입력시 게임시작을 출력하고 0 입력시 게임 종료 출력하기

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		while (true) {
			System.out.println("==========UpDown Game=========");
			System.out.print("======start [1]==exit[0]====== : ");
			int start = sc.nextInt();

			if (start == 0) {
				System.out.println("게임종료");
				break;
			} else {
				System.out.println("게임시작");

				// 랜덤한 숫자를 1~100까지 만들고
				int comNum = rd.nextInt(99) + 1;
				System.out.println(comNum);
				while (true) {
					// 사용자의 입력과 비교해서 랜덤한 수가 더 높은지 낮은지 출력.
					System.out.println("숫자입력 : ");
					int userNum = sc.nextInt();

					if (userNum == comNum) {
						System.out.println("정답입니다.");
						break;
					} else if (userNum > comNum) {
						System.out.println("Down");
					} else {
						System.out.println("Up");
					}
				}
				// 정답일경우엔 "정답"을 출력.
				// 숫자 입력은 정답을 맞출때까지 반복.
			}
		}
	}
}
