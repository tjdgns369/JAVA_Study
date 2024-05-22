package elseif문;

public class TestEquals {

	public static void main(String[] args) {
		
		String str1 ="강성훈", str2="강", str3="성훈" ;
		
		System.out.println(str1);
		System.out.println(str2+str3);
		
		String str4=str2+str3;
		System.out.println(str1==str4); //false가 나오는 이유: 주소가 달라서
		
		System.out.println(str1.equals(str4));
		//true가 나오는 이유
	}

}
