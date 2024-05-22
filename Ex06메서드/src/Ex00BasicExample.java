
public class Ex00BasicExample {

	public static void main(String[] args) {
		
		System.out.println(plus(3,4));
		System.out.println(minus(5,4));
		System.out.println(conVstr(0));
		System.out.println(isDivisor(5,2));
		System.out.println(isPerfNum(6));
		System.out.println(closer10(11,7));
		System.out.println(fibo(30));
		
		

	}
	
	public static int plus(int num1, int num2) {
		//방법.1
		int num3=num1+num2;
		return num3;
	}
	
	private static int minus(int num1, int num2) {
		//방법.2
		return num1-num2;
	}
	
	public static int multi(int num1, int num2) {
		
		return num1 * num2;
	}
	
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public static String conVstr(int num) {
		if(num==0) {
			return "0입니다.";
		}else if(num>0) {
			return "양수입니다.";
		}else {
			return "음수입니다.";
		}
	}
	
	//약수구하기(두수를 나눈 나머지가 0)
	public static boolean isDivisor(int num1, int num2) {
		return num1%num2==0;	
	}
	
	//완전수 구하기(자신을 제외한 약수들의 합 == 자신)
	public static boolean isPerfNum(int num) {
		int sum = 0;
		for(int i=1; i<=num/2; i++) {
			
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
	}
	
	//근거리 알고리즘
	private static int closer10(int num1, int num2) {
		// num1과 10의 거리, num2와 10의 거리 측정 후 비교.
		
	   //   1. 10이랑 각각의 수를 비교해서 num1-10할지 10-num1 할지 선택.
		
       // v 2. 값을 뺀 뒤에 절대값을 구해서 비교해보자. -> java의 도구중 Math클래스를 이용.
		
	   //   3. 빼고 제곱해버리기.
		
		int dis_num1=Math.abs(10-num1);
		int dis_num2=Math.abs(10-num2);
				
		return dis_num1 > dis_num2 ?num2:num1;
	}
	
	//fibo수열
	//피보나치수열의 n번째 항을 계산해서 return하는 fibo메서드 설계하기.
	public static int fibo(int n) {
		if(n==1 || n==2) {
			return 1;
		}
//			else if(n==3) {
//			return fibo(1)+fibo(2);
//		}else if(n==4) {
//			return fibo(2)+fibo(3);
//		}else if(n==5) {
//			return fibo(3)+fibo(4);
//		}
		else {
		return fibo(n-2)+fibo(n-1);
	}
	}	
}
	
