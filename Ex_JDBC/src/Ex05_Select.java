import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex05_Select {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		// 동적 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DB연결
			String user = "service";
			String pw = "12345";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			conn = DriverManager.getConnection(url, user, pw);

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// sql 통로
			String sql = "select * from MEMBER";
			psmt = conn.prepareStatement(sql);

			// sql 통과 코드 작성
			// insert, update, delete - psmt.executeUpdate()
			// select -  psmt.executeQuery() 메소드 사용!
			//  ㄴ> 왜??? -> 결과값을 가지고 올 수 있는 통로가 필요!
			// 통로는 1개의 역할만 가능
			// Connection - 연결 기능
			// PrepareStatement - sql 이동 가능
			// ResultSet 통로 - select 결과값을 담아서 가지고 오는 기능
			// 커서객체
			
			ResultSet rs = psmt.executeQuery();
			//rs.next() : select결과값에 데이터 유무를 보는 함수
			//  ㄴ 반환타입 boolean :  한줄의 데이터가 있으면 true, 없으면 false
			// true일시 다음줄의 데이터 유무를 확인
			
			while(rs.next()) {//데이터가 false일때까지 알기 위해서
				String select_id = rs.getString("id");
				String select_pw = rs.getString("pw");
				String select_name = rs.getString("name");
				int select_age = rs.getInt("age");
				
				System.out.println("id : "+select_id);
				System.out.println("pw : "+select_pw);
				System.out.println("name : "+select_name);
				System.out.println("age : "+select_age);
				
				System.out.println("============================");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// 통로 닫기
		finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
