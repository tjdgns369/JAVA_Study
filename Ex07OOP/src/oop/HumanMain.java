package oop;

public class HumanMain {

   public static void main(String[] args) {
      
      // 송승호 객체 만들기
      Human human1 = new Human();
      Human human2 = new Human();
      Human human3 = new Human();
      Human human4 = new Human();
      Human human5 = new Human();
      
           
      // human1에 데이터 넣어주기.
      human1.name = "송승호";
      human1.age = 50;
      human1.footSize = 255;
      human1.kg = 68;
      human1.knowledge = 50;
      human1.health = 100;
      human1.length = 177;
      human1.bloodType="A";
      
      human1.eat();
      human1.age_Check();
      human1.exercise();
      human1.study();
      human1.playing();
      human1.blood_Check();
      
      System.out.println();
      System.out.println("==============");
      System.out.println("Human2");
      
      
      // human2   ->art+shift+a 동시에 수정하기
      human2.name = "강성훈";
      human2.age = 35;
      human2.footSize = 230;
      human2.kg = 50;
      human2.knowledge = 50;
      human2.health = 100;
      human2.length = 85;
      human2.happy =50;
      human2.bloodType="A";
           
      human2.eat();
      human2.age_Check();
      human2.exercise();
      human2.study();
      human2.playing();
      human2.blood_Check();
      

   }

}