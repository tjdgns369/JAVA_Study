package extends_;

public class Fish extends Animal {
	
	Fish() {
		myClass="물고기";		
	}
	@Override //@도 주석이다. 무언가를 참조하는~
	void breath() {
		System.out.println(myClass+"가 물에서 숨쉰다.");
	}

}
