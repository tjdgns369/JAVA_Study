package abstract_;

abstract public class Character { //abstract 키워들르 붙이면 추상클래스가 된다.
	  //목적: 1. 명확한 계층 구조가 필요할때
	  //	 2. 요구사항과 함께 구현 세부 정보가 일부 기능만 지정되었을 때
	  //	 3. 부모클래스에서 가진 기능을 강제적으로 구현해야 할 때
	 
	abstract public void attack();
}
