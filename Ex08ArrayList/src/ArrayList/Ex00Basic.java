package ArrayList;

import java.util.ArrayList;

public class Ex00Basic {

	public static void main(String[] args) {
		/*  1. ArrayList 만들기
		 *  int[]변수명 = new int[배열의 크기];
		 *  
		 *  ArrayList<데이터타입> 변수명 = new ArrayList<>();
		 *  
		 *  사용할때 import를 시켜줘야한다.
		 *  
		 *  ex01) 우리 팀원을 담아둘 수 있는 ArrayList 만들기
		 * 		  new 뒤에 데이터타입은 생략이 가능하다.*/
		
		ArrayList<String> names = new ArrayList<String>(); 
		
		// 1> 팀원이름 추가하기.
		names.add("강성훈");
		names.add("권창안");
		names.add(1, "장용진"); //배열의 중간에 끼워넣기 add(int Index, String)
		
		// 2> 팀원 출력하기.
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		//System.out.println(names.get(2));
		
		// 3> 팀원 삭제.
		names.remove(1);
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		//System.out.println(names.get(2));
		names.add("유승영");
		names.add("유승영");
		names.add("유승영");
		names.remove("유승영");
		System.out.println("============");
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		//System.out.println(names.get(4));
		System.out.println("======2번 인덱스 출력======");
		
		//팀원변경하기
		names.set(2, "김경민");
		System.out.println(names.get(2));
		
		System.out.println(names.size());
		
		//===============================================
		ArrayList<Integer>nums = new ArrayList<>();
		// Integer, Double, Float, Byte, Short, Long, Character, Boolean
		ArrayList<Double>nums1 = new ArrayList<>();
		ArrayList<Float>num2 = new ArrayList<>();
		ArrayList<Byte>nums3 = new ArrayList<>();
		ArrayList<Short>nums4 = new ArrayList<>();
		ArrayList<Character>nums5 = new ArrayList<>();
		ArrayList<Boolean>nums6 = new ArrayList<>();
		//ArrayList에 <>안에는 Wrapper Class가 들어간다.
		
	
	}

}
