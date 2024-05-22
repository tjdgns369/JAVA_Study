package vo;

import java.util.Objects;

public class UserVO {

	
		// VO(value object) : 데이터 자체를 표현하는 객체.
		// 객체가 상태와 행위를 나타냈다면, VO는 상태만을 표현한다.
	
		/* VO의 특징 : 1. 불변성, 2. 값의 동등성, 3. 로직메소드의 부재.
		 * 
		 * 불변성 : 생성자를 이용해 속성에 값을 넣어 만든 VO객체는 절대 바뀔 수 없어야한다.
		 * 로직메소드의 부재 : 데이터를 확인하는 용도외의 로직메소드가 존재해서는 안된다.
		 * 값의 동등성 : 같은 VO로 생성한 두 객체는 속성이 같다면 서로 같다고 판별해야 한다.
		 * 
		 * ===VO의 형태
		 * 1. VO는 외부에서 바꿀 수 없음. (private 접근제한자를 이용해)
		 * 2. VO객체를 생성할 때 값을 넣어줄 것이므로, 생성자를 만들어 이용한다.
		 * 3. VO객체에 접근해 데이터를 꺼내기 위해서는 getter메서드를 만들어 사용해야 한다.
		 * get***()과 같은 형식의 이름을 사용한다.
		 * 
		 * ===getter의 구조
		 * public 리턴타입 getXXX(){
		 * 		 return XXX;
		 * }
		 *  return에는 해당하는 field를 내보내준다.
		 * */
	
		private String name;
		private String email;
		private String password;
		
		UserVO(String name, String email, String password){
			this.name=name;
			this.email=email;
			this.password=password;
			
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

/*		@Override
		public int hashCode() {
			return Objects.hash(email, name, password);
		}
*/
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UserVO other = (UserVO) obj;
			return Objects.equals(email, other.email) && Objects.equals(name, other.name)
					&& Objects.equals(password, other.password);
		}
		
		/* DTO(Data Transfer Object) -> setter가 사용됨
		 *  목적 :  계층간의 Data 전달에 목적을 둔 객체다.(JDBC할 때 나올개념)
		 *  VO와 비슷하지만 동등성과 불변성의 개념은 없다.
		 * */
		
		
		
		
}
