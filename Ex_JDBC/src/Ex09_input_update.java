import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex09_input_update {

	public static void main(String[] args) {

		// di를 바탕으로 age 수정 해보겠습니다.

		// sql : update member set age =? where id = ?

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
			String update_id = sc.next();
			
			System.out.print("변경age 입력 : ");
	           int update_age =sc.nextInt();

			// sql 통로 열기
			String sql = "update member set age =? where id = ?";
			psmt = conn.prepareStatement(sql);
			
			//?가 있는 경우 -> 물음표 채워주기
			//sql문의 물음표를 기준으로 인덱스 번호 1~ 부여하기
			psmt.setInt(1, update_age);
			psmt.setString(2, update_id);

			// sql 통과 할 수 있는 코드
			int row = psmt.executeUpdate();
			if (row > 0) {
				System.out.println("update success");
			} else {
				System.out.println("update fail");

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
