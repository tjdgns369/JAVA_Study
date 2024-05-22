package Interface_;

public interface Attack {
	int damage=100;
	
	default void att() {
		System.out.println("공격");
	}

}
