package DTO;

public class MemberDTO {
	
	// DTD == VO (VO와 비슷)
	//Data Transfer Object
	//테이블 1당 1개의 객체를 가지고 있어야합니다
	//데이터 변환 객체 -- MemberDTO member테이블에 있는 정보들 담아준다.
	
	//member 테이블에 있는 컬럼 전부 작성!
	private String id;
	private String pw;
	private String name;
	private int age;
	
	//생성자 역할: 객체를 "생성할 때" 최초로 실행하는 코드
	//생성자 생김새: 클래스명과 동일 대수문자 구분 -> 똑같이 쓰기
    //   리턴타입: 작성하지 않습니다.
	
	
	public String getId() {
		return id;
	}
	public MemberDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
