package 다중for문;

import java.util.Scanner;

public class Ex04_star {

	public static void main(String[] args) {

		//*
		//**
		//***
		//****
		//......사용자가 입력한 숫자만큼
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for(int j=0; j<num; j++) { //세로 나타내는 곳
			for(int i=0; i<j+1; i++) { // 가로 별갯수
				System.out.print("*");
		}
		System.out.println();
	   }

	}
}
