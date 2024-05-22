package while문;

import java.util.Scanner;

public class Ex04Login {

	public static void main(String[] args) {

		// 1.사용자 입력 받기
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		String id = "user";
		String pw = "pass";
		String answer;
		boolean run = true;

		while (run) {
			System.out.print("아이디 입력 : ");
			String inID = sc.next();
			System.out.print("비밀번호 입력 : ");
			String inPW = sc.next();

			// 2.로그인 성공의 경우
			if (inID.equals(id) && inPW.equals(pw)) {
				System.out.println("로그인성공");
				break;
			} else {
				System.out.println("로그인 실패");
				cnt++;

				if (cnt == 3) {
					System.out.println("본인인증을 해주세요.");
					break;
				}
				while (true) { // 계속 로그인을 할것인지 묻는 구문
					System.out.print("계속 하시겠습니까? (Y/N) >> ");
					answer = sc.next();

					if (answer.equals("N") || answer.equals("n")) { // 사용자가 N을 선택할 경우
						run = false;
						break;
					} else if (answer.equals("Y") || answer.equals("y")) { // 사용자가 Y를 선택하는 경우
						break;
					} else { // 그 외의 잘못 된 선택을 할 경우.
						System.out.println("잘못된 입력입니다.");

					}
				}
			}

		}
	}
}
