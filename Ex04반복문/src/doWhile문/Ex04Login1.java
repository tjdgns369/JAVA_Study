package doWhile문;

import java.util.Scanner;

public class Ex04Login1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String id = "Hello";
		String pw = "1234";
		String answer;

		while(true) {
			System.out.print("아이디를 입력해주세요 >> ");
			String input_id = sc.next();
			System.out.print("비밀번호를 입력해주세요 >> ");
			String input_pw = sc.next();

			if(input_id .equals(id) && input_pw .equals(pw)){
				System.out.println("로그인 성공!");
				break;
			}
			System.out.print("계속 하시겠습니까? (Y/N) >> ");
			answer=sc.next();

			if(answer .equals ("N")) {
				System.out.println("종료합니다.");
				break;
			}

		} 

	}

}
