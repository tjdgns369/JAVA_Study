package 다중for문;

public class Ex01_1구구단 {

	public static void main(String[] args) {
		
		for(int j = 1; j < 11; j++) {
			
			for (int i = 2; i < 10; i++) {
				System.out.print(i + "*"+j+"=" + (i) * j);
				System.out.print("\t");
				// 단++
			}
			System.out.println();
		}
			
		// for (int i = 0; i < 11; i++) {
		// System.out.print(i + 2 + "*2=" + (i + 2) * 2);
		// System.out.print("\t");
		// 단++
		// }
		// System.out.println();
		// for (int i = 0; i < 11; i++) {
		// System.out.print(i + 2 + "*3=" + (i + 2) * 3);
		// System.out.print("\t");
		// }
	}

}
