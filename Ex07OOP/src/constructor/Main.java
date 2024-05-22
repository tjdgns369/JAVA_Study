package constructor;

public class Main {
	
	static String brand;
	public static void main(String[] args) {
		//1. 기본생성자를 이용해서 객체 생성 시 초기작업과 초기값이 알맞게 입력되었는지 확인하기.
		
		Restaurant restA = new Restaurant();
		System.out.println(restA.address);
		System.out.println(restA.money);
		System.out.println();
		
		//2.매개변수로 초기값들 받아오는 생성자를 가지는 객체 만들기.
		Restaurant restB = new Restaurant("목포시", 2000);
		System.out.println(restB.address+restB.money);
		
		//3. 생성자를 이용해서 매개변수를 강제할 수 있다.(개수와 타입)
		//Restaurant restC= new Restaurant(351);
	}

}
