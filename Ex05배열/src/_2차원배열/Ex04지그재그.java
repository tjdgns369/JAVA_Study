package _2차원배열;

public class Ex04지그재그 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];

	      int cnt = 1;

	      // 1 ~ 25 정수를 입력하는 이중 for문
	      for (int j = 0; j < array.length; j++) { // j : 행, i : 열
	         for (int i = 0; i < array[j].length; i++) {
	            array[j][i] = cnt++;
	         }
	      }
	      for (int j = 0; j < array.length; j++) { // j : 행, i : 열
	    	  for (int i = 0; i < array[j].length; i++) {
	    		if(j%2==0) {
	    			System.out.print(array[j][i] + "\t");
	    		}else {
	    			System.out.print(array[j][4-i] + "\t");
	    		}
	    	  }
	    	  System.out.println();
	      }
	}

}
