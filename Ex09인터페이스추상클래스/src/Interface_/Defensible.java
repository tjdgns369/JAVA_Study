package Interface_;

public interface Defensible {

	// public void defen();

	// 1. 정적메서드 -> 객체를 생성하지 않아도 사용할 수 있는 메서드.
	static void defen2() {
		System.out.println("asd");
	}
	// 2. default 메서드
	default void defen() {
		System.out.println("방어하기");

	}
}
