package oop;

public class Main {

	public static void main(String[] args) {
		Restaurant restA= new Restaurant();  //new키워드를 써서 객체를 생성한다.
		Restaurant restB= new Restaurant();
		Restaurant restC= new Restaurant();
		Restaurant restD= new Restaurant();
		
		// .(점)으로 해당하는 클래스 내의 필드 또는 메서드에 접근이 가능하다.
		
		//A매장의 속성 정의
		restA.address = "목포시 산정로 212번길";
		restA.brand = "버거킹";
		restA.numBurger = 0;
		restA.money =1000000;
		//B매장의 속성 정의
		restB.address = "광주광역시 어딘가";
		restB.brand = "롯데리아";
		restB.numBurger = 0;
		restB.money =1000000;
		
		restA.takeOrder("치즈버거");
		int reqMoney = restA.request();
		restA.calculate(reqMoney);
		System.out.println(restA.money);
	}

}
