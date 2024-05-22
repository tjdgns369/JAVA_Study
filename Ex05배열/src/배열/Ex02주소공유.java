package 배열;

public class Ex02주소공유 {

	public static void main(String[] args) {
		
		// 배열 -> 레퍼런스 변수 -> 주소 값
		// 주소를 공유 가능 -> 배열을 공유 가능
		int[] intArray = new int[5];
		int[] myArray = intArray;
		
		System.out.println("intArray 주소 : "+ intArray);
		System.out.println("myArray 주소 : "+ myArray);
		
		intArray[1] = 1;
		myArray[2] = 2; //myArray값을 바꾸고 intArray를 출력해도 값은 변해있다.
		
		
		
		for(int i=0; i< intArray.length; i++) {
			System.out.println(intArray[i]);
			
		//예약어를 입력했을 때 보라색은 기본데이터, 검정색은 참조형데이터타입
			
		//실습
		String[] arrStr = new String[10];
		}
		
		
	}

}
