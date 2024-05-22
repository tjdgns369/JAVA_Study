package 추상화;

public class PenguinGenerator {

	public static void main(String[] args) {
		//팽수만들기
		Penguin pengsu = new Penguin();
		pengsu.name ="팽수";
		pengsu.age = 10;
		pengsu.hi();
		
		//뽀로로만들기
		Penguin pororo=new Penguin();
		pororo.name ="뽀로로";
		pororo.age=24;
		System.out.print(pororo.countOfTail);
		pengsu.hi();
	}

}
