package oop;

public class Human {

      String name;
      String bloodType;
      int health;
      int knowledge;
      int kg;
      int length;
      int age;
      int footSize;
      int happy;
      
      public void eat() {
         System.out.println("밥을 먹었습니다.");
         kg++;
         System.out.println("현재몸무게 : "+kg);
         happy++;
         System.out.println("현재행복도는 :"+happy);
      }
      
      public void exercise() {
         System.out.println("운동을 했습   니다.");
         kg--;
         System.out.println("현재몸무게 : "+kg);
         happy--;
         System.out.println("현재행복도는 :"+happy);
      }
      
      public void study() {
         System.out.println("공부를 했습   니다.");
         knowledge++;
         System.out.println("현재 지식은 : "+kg);
         happy--;
         System.out.println("현재행복도는 :"+happy);
      }
      
      public void playing() {
         System.out.println("놀았습니다.");
         knowledge--;
         System.out.println("현재 지식은 : "+kg);
         happy++;
         System.out.println("현재행복도는 :"+happy);
      }
      
      public void age_Check() {
         if(age<=19) {
            System.out.println("미성년자입니다.");
            
         }else if(age<=40) {
            System.out.println("청년입니다.");
            
         }else if(age<=60) {
            System.out.println("중년입니다.");
         
         }else {
            System.out.println("인생은 지금부터");
         }
      }
      
      public void blood_Check() {
         if(bloodType=="a"||bloodType=="A") {
            System.out.println("A형입니다.조심하세요. 자기전에 다 기억합니다.");
            
         }else if(bloodType=="b"||bloodType=="B") {
            System.out.println("B형입니다.조심하세요. A형 특히");
            
         }else if(bloodType=="o"||bloodType=="O") {
            System.out.println("O형입니다. 성격좋습니다.");
         
         }else {
            System.out.println("AB형입니다. 저를 아세요?");
         }
      }
      
      
      public int feeding(int num) {
         
         return num;
                  
      }
         
      
}
