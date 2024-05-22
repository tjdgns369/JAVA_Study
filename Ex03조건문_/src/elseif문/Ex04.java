package elseif문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// 문제>>금액을 입력받아 총금액, 할인율, 할인금액, 할인된 금액을 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("지불금액을 입력하세요: ");

		int price = sc.nextInt();

// 		******내가푼문제

//		if (price >= 100000) {
//			// 10만원 이상, 10%할인
//
//			System.out.println("총 금액: " + price + "," + "할인율: " + "10%" + "," + "할인 금액: " + (int) (price * 0.1) + "원"
//					+ "," + "할인된 금액: " + (int) (price * 0.9) + "원");
//
//		} else if (money >= 50000) {
//			// 5만원 이상, 5%할인
//			System.out.println("총 금액: " + price + "," + "할인율: " + "5%" + "," + "할인 금액: " + (int) (price * 0.05) + "원"
//					+ "," + "할인된 금액: " + (int) (price * 0.95) + "원");
//		}
		// *****선생님
		
		// 상품가격, 할인율, 할인금액= 상품가격*할인율, 할인된 금액= 상품가격-할인된금액

		int discount = 0;
		if (price >= 100000) {
			discount = 10;
		} else if (price >= 50000) {
			discount = 5;
		}
		int dis = (price * discount / 100);
		int discountPrice = price - dis;
		System.out.println("총 금액: " + price + "원, 할인율: " + discount + "%, 할인 금액: " + dis + "원," + "할인된 금액: "
				+ discountPrice + "원");

	}
}
