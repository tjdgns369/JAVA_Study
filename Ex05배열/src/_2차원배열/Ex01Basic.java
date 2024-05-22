package _2차원배열;

public class Ex01Basic {

	public static void main(String[] args) {
		// int[] 변수명 = new int[크기];
		int[][] array = new int[3][3];
		int[][] array2 = {{1,2,3},{1,2},{6,7},{1,2,3,4,5,6}};
		
		System.out.println(array2[0][0]); //1
		System.out.println(array2[3][2]); //3
//		System.out.println(array2[2][3]); // error
		System.out.println(array2[2]); // [2]주소가 출력되다.
		System.out.println(array2); // array주소가 출력되다. 위의 주소값과 다르다.
		
	}

}
