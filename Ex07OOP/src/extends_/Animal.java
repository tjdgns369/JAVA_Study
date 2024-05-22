package extends_;

public class Animal {
	String myClass;
	String Sound;
	
	Animal(){
		myClass= "동물";
		Sound="호다닥";
	}
	void show() {
		System.out.println(myClass);
	}
	void move() {
		System.out.println(myClass+"가 움직인다.");
	}
	void breath() {
		System.out.println(myClass+"가 살아숨쉰다.");
	}
	void Sound() {
		System.out.println(myClass+Sound);
 }
}
