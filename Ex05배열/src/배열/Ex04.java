package 배열;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {

//		//1.배열만들기. 변수명뒤에 s를 붙여도 된다~
//		//1)int[] nums = new int[5];
//		int [] nums = {13,5,5,10,20};
//		//2. 배열에 데이터 넣기
//		nums[0] = 13;
//		nums[1] = 5;
//		nums[2] = 5;
//		nums[3] = 10;
//		nums[4] = 20;
////	  nums[5] = 1; ->여기까지 쓰고 출력문에 출력하면 바운더리 안에 포함이 안된다고 에러남.
//		
//		//3. 배열에서 데이터 꺼내기
////		System.out.println(nums[1]);		
////		int number = nums[0] ;
////-------------------------------------------------------------------		
//		int[] array2 = new int [100];
////		System.out.println(array2.length); // 100
//		int mul=2;
//		//2의 배수를 넣는 for문
//		 for(int i=0; i<array2.length; i++) { //index = 0~99
//			 array2[i] = mul;
//			 mul *= 2; //2의 배수를 mul에 집어 넣는다.
//		 }
//		 //배열에서 모든값을 꺼내기 위한 for문
//		 for(int i=0; i<array2.length; i++) {
//			 System.out.println(i+"번째 공간 : "+array2[i]);
//		 }
//		 // for-each문 : ==확장for문, 배열의 모든값을 꺼내는 기능
////		 for(잠깐담아둘변수:배열) {
////			 실행문장
//		 
//		 for(int x : array2) {
//			System.out.println(x); 
//		 }
//=============================================================
		// 10칸짜리 배열에 랜덤한 수를 넣고,
		// 해당하는 수의 총합과 평균을 구하기. /최대갑 / 최소값/ 홀수 개수/ 짝수 개수

		// 1. 10칸짜리 배열 만들기.
		int[] nums = new int[10];
		// String[] names = new String[10];
		Random rd = new Random(); // ctrl+shft+o -> 자동 import

		// 2. 데이터 셋팅하기.(리소스 구성)
		// 0~9번 인덱스를 하나하나 일일이 한칸씩 셋팅.
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(20);

			// 중복제거.
			// 검사용 for문 만들기.(j)
			// 1. j범주를 결정.
			// 2. j번째 숫자랑 i번째 숫자를 비교.
			// 3. 만약에 두개의 숫자가 같다면? i를 강제로 -1
			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
		// 3. 데이터 확인하기
		for (int x : nums) {
			System.out.println(x + " ");
		}
		
		 // 총합과 평균을 구하기. /최대갑 / 최소값/ 홀수 개수/ 짝수 개수
		
		int sum=0;
		double avg=0;
				
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i]; // sum=sum+nums[i];
		}
		System.out.println("총합 : "+sum);		
		avg=(double)sum/nums.length;
		System.out.println("평균 : "+avg);	
		
		int max=nums[0];
		int min=nums[0];
				
		for(int i=0; i<nums.length; i++) {
			if(max < nums[i]) { // 지금 현재의 최대값과 배열에 있는 값 비교
				max = nums[i];
			} else if(min > nums[i]) { // 지금 현재의 최소값과 배열에 있는 값 비교
				min = nums[i];
			}
		}
		System.out.println("최소 : 최대 = "+min+" : "+max);
	}
}