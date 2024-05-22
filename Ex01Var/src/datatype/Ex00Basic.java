package datatype;

import java.util.Scanner;

public class Ex00Basic {

	public static void main(String[] args) {
		// 데이터타입. (Primitive(기본) / Reference(참조))
		
		// boolean타입(논리형) 
		//크기: 1bit
		//표현범위  : 참/거짓 (true/false)
	   boolean checkIn = true;
	   boolean checkIn2 = false;
	   // boolean checkIn2 = 324; -> 불가능하다!
	   
	   // char 타입 (문자형)
	   //크기 : 2byte : 0~65535
	   //Java에서 char는 UNICODE와 대응한다.
	   //C언어 등에서는 1byte를 사용하더라.
	   //Ascii코드는 8bit 체계로 만들어져있다.
	   //=> 이 중 1bit는 parity code로 1의 갯수가 홀수인지 짝수인지 알려준다.(오류검증용)
	   //그 결과 0~127까지만 표현이 가능했다.
	   // 이를 8bit까지 쓰게 하려다보니 ANSI체계로 256개의 문자와 대응하게 만들었는데,
	   //한글이나 한자 등을 표현하기 어려워서 UNICODE가 생겼다.
	   // ANCII (7bit) -> ANSI (8bit) -> UNICODE (16Bit)
	   char name = '강';
	   
	   // String(문자열) 타입
	   //char타입은 한글자라는 한계가 있다.
	   //그래서 string이라는 reference타입을 미리 만들어 두었다.
	   String name2 ="강성훈";
	   
	   // byte 타입 (정수형)
	   //크기: 1byte
	   // 표현범위 : 2^8 => -123~127
	   // 날짜, 나이
	   byte day=29;
	   byte age=100;
	   //저장하기 -> ctrl + s
	   
	   // short 타입 (정수형)
	   //크기: 2byte
	   //표현범위: -32768 ~32767
	   //년도, 
	   short year = 2024;
	   
	   // int 타입(정수형)
	   //크기: 4byte
	   //표현범위: 약 -21억 ~ 21억
	   //한국인구수
	   int koreaHuman = 5000000;

	   // long 타입 (정수형)
	   //크기: 8byte
	   //표현범위: -920경 ~920경
	   //숫자가 너무커서 int를 사용하는 추세.
	   long word_Human = 7000000000L; //L을 붙여줘야 롱타입이다 컴퓨터가 알아요.
	   
	   // float 타입(실수형)
	   //크기: 4byte
	   //특징 -> 부동소수점을 사용한다. (bit를 지수부와 가수부로 나누어져사용해서 범위가 엄청크다.)
	   // float도 알파벳을 뒤에 붙여야한다.
	   float pi=3.14f;//뒤에 f를 붙여주자.
	   
	   // double 타입(실수형)
	   //크기: 8byte
	   //표현범위 : -1.7e308~1.7e308
	   //float이든 double이든 미세한 오차가 발생할 수 밖에 없다. => 물리적 오차.
	   //항상 값에 소수점을 표기해줘야한다.
	   double num = 1.456789;
	   
	   //데이터 타입들은 어느정도 서로 타입을 변환할 수 있다.
	   // 자동형변화(==묵시적 형변환) / 강제형변환(==명시적 형변환)
	   
	   // 묵시적 형변환
	   //등호를 기준으로 타입이 일치하지 않을 때1
	   //이때 자바의 컴파일러가 알아서 작은타입을 큰 타입으로 자동 변환 시켜주는 것.
	   double tenPi=3.14*10;  //3.14*10에서 10이 실수연산을 위해서 10.0이 된다.
	   
	   int num1 = 10;
	   double num2 = 20.0;
	   num2=num1;
	   //num2로 num1이 들어가기 위해 10이 10.0이 됨.
	   //출력하기.
	   System.out.print(num2);
	   System.out.println(); //출력문 자동완성: syso+ctrl+space
	   // 실행할 때 단축키: ctrl + F11
	   
	   // 명시적 형변환(강제형변환; casting)
       //소괄호를 이용해 타입을 명시하여 강제로 변환한다.
	   double pie = 3.14;
	   int intPie = (int)pie; 
	   System.out.println(intPie);
	   
	   //Scanner (입력을 하기위한 도구)
	   //System.in.read를 사용하면 출력을 ASCII코드에 맞춰 바꿔줘야 했음.
	   //편하게 입력하기 위해 Scanner라는 도구를 사용할거다.
	   //JRE에 포함된 라이브러리 중 하나!
	    Scanner sc = new Scanner(System.in);
	    String name3 = sc.next();
	    System.out.println("입력끝");
	    System.out.println(name3);
	   // System.err.println("메롱");  //err=error 
	    
	    // 숫자를 두개 입력받아서 더하는 코드 작성하기.
	    System.out.print("첫번째 정수를 입력해주세요 : ");
	    int num3 = sc.nextInt();
	    System.out.print("두번째 정수를 입력해주세요 : ");
	    int num4 = sc.nextInt();
	     //1. 바로 출력하기
	    System.out.println(num3+num4);
	    
	     //2. 변수에 한번 다시 담아서 출력하기.
	     int num5 = num3+num4;
	    System.out.println(num5);
	   
	   
	 
	   
	   
	   
	   
	   
  }

}
