package _2차원배열;

import java.util.Scanner;

public class Ex05정답맞추기 {

	public static void main(String[] args) {
		
		
		// 1. 입력하는 도구 가져오기 -> Scanner
		Scanner sc = new Scanner(System.in);
		
		//2. 3행 5열의 2차원배열 만들기
		//0번행 -> 답으로 초기화 : 4,5,4,1,2
		//1번행 -> 입력한 값 : 0,0,0,0,0
		//2번행 -> 배점으로 초기화 : 10,20,30,20,20
		
		//{} -> 일차원 배열         0  1  2  3  4
		int[][]answer = {/*0*/ {4, 5, 4, 1, 2},
				    	 /*1*/ {0, 0, 0, 0, 0},
						 /*2*/ {10,20,30,20,20} };
		
		//정답데이터 입력받고 이차원배열릐 1번행에 차례대로 넣기
		for(int i = 0; i<answer[0].length; i++) {
			System.out.print((i+1)+"번째 답 >> ");
			answer[1][i] = sc.nextInt();
		}
		// 정답 비교 후 맞았을 때 sum 변수에 누적하기
		// [0]행 : 답
		// [1]행 : 입력값
		// [2]행 : 배점
		int sum=0;
		
		for(int i=0; i < answer[0].length;i++) {
			
			if(answer[0][i] == answer[1][i]){
			System.out.print("O"+"\t");
			sum += answer[2][i];
		}else {
			System.out.print("X"+"\t");
			}
		}	System.out.println();
		
			System.out.println("총합 : "+ sum + "점");

			
			
//		System.out.print("1번째 답 >> ");
//		answer[1][0] = sc.nextInt();
//		System.out.print("2번째 답 >> ");
//		answer[1][1] = sc.nextInt();
//		System.out.print("3번째 답 >> ");
//		answer[1][2] = sc.nextInt();
	}
}
