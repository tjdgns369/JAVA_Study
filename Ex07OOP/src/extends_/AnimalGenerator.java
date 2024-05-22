package extends_;

public class AnimalGenerator { // 슈퍼클래스

	public static void main(String[] args) {
		Animal ani1 = new Animal();
		Bird ani2 = new Bird();
		Mammailia ani3 = new Mammailia();
		Fish ani4 = new Fish();
		// 상속의 장점1 : 중복되는 코드를 줄일 수 있다.

		ani1.show();
		ani1.move();
		ani1.breath();

		ani2.show();
		ani2.move();
		ani2.breath();

		ani3.show();
		ani3.move();
		ani3.breath();

		ani4.show();
		ani4.move();
		ani4.breath();
		// 상속의 장점2 : 사람의 논리를 그대로 코드로 옮길 수 있다.
		Animal ani6 = new Mammailia(); // 포유류는 하나의 동물이다.
		Animal ani7 = new Fish(); // 물고기는 하나의 동물이다.

		// Animal ani5 = new Bird();

		// int[] array = new int[10];

		Animal[] aniArray = new Animal[10];

		// aniArray[0]=ani5;
		aniArray[1] = ani2;
		System.out.println(aniArray[1].myClass);

		Animal ani5 = (Animal) ani2;
		Bird ani8 = (Bird) ani5;
		ani8.fly();

		Whale ani9 = new Whale();

		Animal[] animalFarm = new Animal[7];

		animalFarm[0] = new Bat();
		animalFarm[1] = new Cat();
		animalFarm[2] = new Dog();
		animalFarm[3] = new Sparrow();
		animalFarm[4] = new Whale();
		animalFarm[5] = new Mouse();
		animalFarm[6] = new Penguin();

		for (Animal x : animalFarm) {
			x.Sound();
			x.breath();
		}
	}
}
