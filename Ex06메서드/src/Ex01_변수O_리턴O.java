
public class Ex01_변수O_리턴O {

	public static void main(String[] args) {
		
		// 메소드 호출 방법 : 메소드이름(매개변수);
		sum(5,10); // 15
		
		System.out.println(sum(6,20));

	}
	
	// 메소드의 구조
	// 1. 접근제한자 : public(어디에서든 접근가능)
	// 2. static : 저장공간
	// 3. 리턴타입(리턴값이 없는 경우 void 작성)
	// 4. 메소드이름(매개변수 나열)
	// 5. 리터값이 있다면 "return" 키워드 사용
	
	public static int sum(int a, int b) {
		int result = a + b;
		 return result;
	}

	
	
	
	
	
	
	
	
	
	
}
