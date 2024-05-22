import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex03_Update {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;

		// 동적로딩
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

			String sql = "update MEMBER set name='test' where id = 'test2'";
			psmt = conn.prepareStatement(sql);

			// sql통과 할 수 있는 코드
			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("update success");
			} else {
				System.out.println("update fail");
			}

			// 닫기
			// 통로를 모두 닫다.
			// psmt - sql통과 할 수 있는 통로
			// conn - db-java 연결 통로

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 주의사항
			// psmt 통로는 conn안에 있습니다.
			// 통로를 연 역순으로 닫아 줍니다.
			// 통로를 연 순서 - conn - psmt
			{
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

}
