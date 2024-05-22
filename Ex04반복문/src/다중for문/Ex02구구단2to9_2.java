package 다중for문;

public class Ex02구구단2to9_2 {

	public static void main(String[] args) {
		
		for (int j = 2; j <= 9; j++) {
			System.out.print(j + "단 :");
			
			for (int i = 1; i <= 9; i++) {
				System.out.print(j + "*" + i + "=" + (j * i));
				System.out.print("\t"); //키보드 Tap_("	");으로 띄워줘 도 된다.
			}
			System.out.println();
		}

	}

}
//디버거 파란색 좌측줄에 마우스 오른쪽키"툴브레이킹포인트 선택" or "더블클릭"
//벌레모양 툴 클릭, 스위치 F8