package vo;

public class UserTestVO {

	private String name;
	private String email;
	private String password;
	
	public UserTestVO(String name, String email, String password) {
		//super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() { //getter를 일일이 작성하는 것을 한번에 해준다. 마우스 우클릭 + 소스->generate toString()클릭
		return "UserTestVO [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
