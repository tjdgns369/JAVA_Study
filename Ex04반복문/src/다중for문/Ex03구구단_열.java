package 다중for문;

public class Ex03구구단_열 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j * i));
				System.out.print("	");
			}
			System.out.println();
		}

	}

}
