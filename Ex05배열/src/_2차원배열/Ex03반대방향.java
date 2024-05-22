package _2차원배열;

public class Ex03반대방향 {

	public static void main(String[] args) {
	     int[][] array = new int[5][5];

	      int cnt = 1;

	      // 1 ~ 25 정수를 입력하는 이중 for문
	      for (int j = 0; j < array.length; j++) { // j : 행, i : 열
	         for (int i = 0; i < array[j].length; i++) {
	            array[j][i] = cnt++;
	         }
	      }
	      
	      // 출력부
	      for(int j = 0; j < array.length; j++) {
	         for(int i = 0; i < array[j].length; i++) {
	            System.out.print(array[j][4-i] + "\t");
	         }
	         System.out.println();
	      }
	}

}
