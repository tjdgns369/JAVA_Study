
public class 비교연산자 {

	public static void main(String[] args) {
		// 비교연산자의 종류
		// <,>,<=,>=,==,!=
		// 비교연산자의 결과는 언제나 참/거짓 (True/False) -> boolean자료형
		
	     int num1=10, num2=9;
	     System.out.println(num1>num2);
	     System.out.println(num1<num2);
	     
	     int num3=20, num4=20;
	     System.out.println(num3==num4);
	     System.out.println(num3!=num4);
	     
	     // 문자열비교.
	     String str1 ="1";
	     String str2 ="1";
	     System.out.println(str1==str2);
	     System.out.println(str1.equals(str2)); //문자열비교는 '.equals'를 사용한다. (변수명 .equals(변수명2)); 
	    		
	     
	     
	     

	}

}
