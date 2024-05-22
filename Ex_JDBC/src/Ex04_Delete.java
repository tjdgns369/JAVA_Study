import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex04_Delete {

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
			String sql = "delete from MEMBER where id = 'TEST1'";
			psmt = conn.prepareStatement(sql);

			// sql 통과 코드 작성
			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("delete success");
			} else {

				System.out.println("delete fail");
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
