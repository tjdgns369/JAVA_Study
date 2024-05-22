package 조건연산자;
import java.util.Scanner;

public class 심화문제 {

	public static void main(String[] args) {
	
		 Scanner sc= new Scanner(System.in);
		 
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();

		System.out.println((age >10 ?( age >20 ?( age >35 ? "중장년입니다.":"청년입니다."):"청소년입니다."):"어린이입니다."));		
		
	}

}
