package _2차원배열;

import java.util.Scanner;

public class NN_열{

	public static void main(String[] args) {
		// 1.사용자 입력
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];

		int cnt = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[j][i] = cnt++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println(" ");
		}

	}
}
