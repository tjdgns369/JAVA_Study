import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex07_Input_Insert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

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
			// scanner 사용하기
			Scanner sc = new Scanner(System.in);
			System.out.print("id 입력 : ");
			String input_id = sc.next();

			System.out.print("pw 입력 : ");
			String input_pw = sc.next();

			System.out.print("name 입력 : ");
			String input_name = sc.next();

			System.out.print("age 입력 : ");
			int input_age = sc.nextInt();

			// sql 통로 열기
			String sql = "insert into member values(?,?,?,?)";
			// ?: 쿼리문의 매개변수
			// ㄴ 위치에 따라서 설정이 가능
			// 예) 첫번째 ? : x값을 집어 넣겠다!

			psmt = conn.prepareStatement(sql);

			// 물음표 채우는 코드 (작성 위치 주의!!!!!!!!)

			// 물음표 채우는 코드
			// set메소드를 통해 값을 설정
			// set메소드는 psmt 안에 있습니다!
			// 매개변수2개입 (인덱스 -> 물음표의 위치값, 값) : n번째 물음표에 X값을 넣겠다~
			psmt.setString(1, input_id);
			psmt.setString(2, input_pw);
			psmt.setString(3, input_name);
			psmt.setInt(4, input_age);

			// sql 통과 할 수 있는 코드
			int row = psmt.executeUpdate();
			if (row > 0) {
				System.out.println("insert success");
			} else {
				System.out.println("insert fail");

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// 통로 닫기
		finally {

			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
