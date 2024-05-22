package 다중for문;

public class Ex04정수연속출력 {

	public static void main(String[] args) {

//	예제2_1
//		   >> 1+2+3+4+5+........+100

		int sum = 0;

//		for(int i=1; i<=100; i++) {	
//			sum+=i;						
//		}System.out.println(sum);
		

//	예제2_2
//		  >> 1-2+3-4+5........+99-100
//		  >> 홀수는 더하고, 짝수는 빼고
//		for (int j = 1; j <= 100; j++) {
//			if (j % 2 == 0) {
//				sum -= j;
//			} else {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
		
//	예제2_3  (77*1) +(76*2)+(75*3)+(74*4)+.....+(1*77)
		int count = 1;
		int sum3=0;
		for(int i=77; i>0; i--) {
			sum3 += (i*count); // sum3=wum3+(i*count)
			count++;
		}
		System.out.println(sum3);
	}
}
