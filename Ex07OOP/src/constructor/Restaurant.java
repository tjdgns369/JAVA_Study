package constructor;

public class Restaurant {
	
	String address;
	String brand;
	int money;
	// 생성자 만들기
	// 생성자의 목적 : 객체 생성시에 필요한 초기작업을 수행하기 위해 사용한다.
	// 생성자의 목적2 : 필드의 초기값을 설정하기 위해 사용한다.
	public Restaurant() {
		System.out.println("기본생성자 초기작업!");
		address = "목포시";
		money = 100000;
	}
	
	//생성자도 메서드임. -> 매개변수로 초기값을 받아볼 수도 있음.!
	public Restaurant(String ad, int won) {
		address = ad;
		money = won;
	}
	
	
	public Restaurant(String address, int money, String brand) {
		
		//address = address =>같은 색상인 매개변수가 되었다.
		// (등호를 기준으로 앞은 필드, 뒤는 파라미터여야 하는데, 둘다 파라미터가 되었다.)
		//필드를 선택해주기 위해서는 this 키워드를 이용해 선택할 수 있다.
		// 자바에서 지역변수에 해당하는 변수 이름이 있다면 지역변수를 우선적으로 선택한다.
		this.address = address;
		Main.brand = brand;
		//static 영역의 변수와 이름이 같은 지역변수라면, 앞의 클래스명을 붙이면 됨.
	}
}
