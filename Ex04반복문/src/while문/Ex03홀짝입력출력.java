package while문;

import java.util.Scanner;

public class Ex03홀짝입력출력 {

	public static void main(String[] args) {
		//입력된 숫자가 홀수와 짝수가 몇개 입력되었는지 출력하기.
		//-1을 입력하면 종료/
		
		//1.사용자입력받기
		Scanner sc=new Scanner(System.in);
		
		int input = 0; 
		int evCnt = 0; // evCnt->짝수, odCnt->홀수
		int odCnt = 0;
				
		while(true) {			
			System.out.print("숫자입력 : ");
			input= sc.nextInt();
			
			//2.입력한 값이 짝수인지 홀수인지 파악하고 카운트 올리기.
			 if(input%2 == 0) { //짝수일때
				 evCnt++;							 
			 }else { //홀수일때
				 odCnt++;
			 }	
			 //3.종료조건 잡아주기
			  if(input == -1) {
				  System.out.print("종료되었습니다.");
				  break;
			  }else {
				  System.out.println("짝수개수 : "+evCnt);
				  System.out.println("홀수개수 : "+odCnt);
			  }						
		}
	}
}
