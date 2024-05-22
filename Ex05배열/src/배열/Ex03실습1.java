package 배열;

public class Ex03실습1 {

	public static void main(String[] args) {
		
		
		
		//실습
		//1.문자열 데이터 10개를 담을 수 있는 arrStr 배열 생성(new)
		String[] arrStr = new String[10];
		
		//2.0~4 인덱스에 차례대로 JAVA, HTML, DB, PYTHON, CSS 삽입
		arrStr[0] = "JAVA";
		arrStr[1] = "HTML";
		arrStr[2] = "DB";
		arrStr[3] = "PYTHON";
		arrStr[4] = "CSS";
		
		//3.for문 사용해서 arrStr에 들어있는 데이터 출력하기
		for(int i =0; i < arrStr.length;  i++) {
			System.out.print(arrStr[i]+" ");
			
			
		}
	}

}
