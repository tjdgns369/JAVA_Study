package vo;

public class Main_VO {

	public static void main(String[] args) {
		
		UserVO user1=new UserVO("송승호","seung571@gamil.com","abcd");
		UserVO user2=new UserVO("송승호","seung571@gamil.com","abcd");
		
		UserTestVO user3 = new UserTestVO("김경민", "rlarudals@naver.com", "rlarudalsakstp");
		//System.out.println(user1.name);
		//user1.name="오종원";
		System.out.println(user1.getName());
		System.out.println(user1.getEmail());
		System.out.println(user1.getPassword());
		
		//System.out.println(user1.email);
		System.out.println(user1.equals(user2));
		System.out.println(user3);

	}

}
