import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex06_Select_Index {

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
			String sql = "select id, name from member";
			psmt = conn.prepareStatement(sql);

			// sql 통과
			rs = psmt.executeQuery();

			while (rs.next()) {
				// 인덱스의 숫자기준은
				// DB내 테이블이 기준이 아니라 select해 온 결과값이 기준
				String select_id = rs.getString(1);
				String select_name = rs.getString(2);

				System.out.println("id : " + select_id);
				System.out.println("name : " + select_name);

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
