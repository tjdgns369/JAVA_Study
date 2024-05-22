package elseif문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//다중if문 예제2.
		
		//1. 입력도구
		Scanner sc=new Scanner(System.in);
				
        //2. 상수선언 -> 왜?? 안바뀔값이기 때문에	
		final String U_ID= "user", U_PW= "pass";
		
		System.out.print("ID : ");
		String ID=sc.next();
		System.out.print("PW : ");
		String PW=sc.next();
		
		if(ID .equals(U_ID)&& PW.equals(U_PW)) {
			System.out.println("로그인에 성공했습니다.");
		}else if(!ID .equals(U_ID)){
			System.out.println("아이디가 일치하지 않습니다.");
		}else { //위의 else if 이외의 입력이 들어오면...
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
						
	}

}
