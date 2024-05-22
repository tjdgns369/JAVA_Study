package 배열;

import java.util.Random;
import java.util.Scanner;

public class Ex01배열 {

	public static void main(String[] args) {
		
		//변수 선언
		int a;
		
		//변수 생성
		a = 10;
		// int a = 10;
		
		//배열 선언 -> 데이터타입[] 배열이름;
		int[] intArray;
		
		//배열 생성 -> 배열이름 = new 데이터타입[배열크기];
		intArray = new int[5];
		
		// 기본데이터 타입(크기가 정적)
		// 논리형, 문자형, 정수형, 실수형
		
		// 레퍼런스 타입(new) -> 주소 값(크기가 유동적)
		// Scanner, Random, String..._import 후에 사용가능
		// 기본데이터 타입을 제외한 모든 데이터 타입은 레퍼런스다. 
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		
		System.out.println("a : " + a );
		System.out.println("intArray : " + intArray );
		
		// 배열의 크기를 알려주는 키워드 -> 배열이름 .length
		System.out.println("배열크기 : " + intArray.length );
		
		// 배열의 값에 접근
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
//		System.out.println(intArray[0]);
//		System.out.println(intArray[1]);
//		System.out.println(intArray[2]);
//		System.out.println(intArray[3]);
//		System.out.println(intArray[4]);
		
		// 배열의 값을 수정 또는 삽입
		intArray[0] = 2 ;
		intArray[1] = 4 ;
		intArray[2] = 6 ;
		intArray[3] = 8 ;
		intArray[4] = 10 ;
//		System.out.println(intArray[0]);
//		System.out.println(intArray[1]);
//		System.out.println(intArray[2]);
//		System.out.println(intArray[3]);
//		System.out.println(intArray[4]);
		
		// 배열 선언 및 생성하는 방법
		// 1. 데이터타입[] 레퍼런스변수명 = new 데이터타입[배열크기];
		// 2. 데이터타입[] 레퍼런스변수명 = {data1, data2, data3};
		// 							[0]     [1]   [2]
		
		String[] team = {"김건형", "장용진", "권창안", "강성훈"};
		
		System.out.println("배열크기 : " + team.length);
		// for문 사용해서 팀원이름 출력
		for(int i =0; i < team.length;  i++) {
			System.out.println(team[i]);
		}
	}

}
