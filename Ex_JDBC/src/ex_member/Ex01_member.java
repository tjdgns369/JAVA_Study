package ex_member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_member {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("회원관리 프로그램");
			System.out.println("1.전체 회원 조회 2.회원가입 3.회원정보 삭제 4. 비밀번호 수정 5.종료");

			int choice = sc.nextInt();
			if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
				
			} else if (choice == 1) {
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

					// sql문 통로
					String sql = "select * from member";
					psmt = conn.prepareStatement(sql);

					// sql 통과코드
					rs = psmt.executeQuery();
					while (rs.next()) {
						String get_id = rs.getString("id");
						String get_pw = rs.getString("pw");
						String get_name = rs.getString("name");
						int get_age = rs.getInt("age");

						System.out.println(("id : ") + get_id);
						System.out.println(("pw : ") + get_pw);
						System.out.println(("name : ") + get_name);
						System.out.println(("age : ") + get_age);
						System.out.println("=====================");
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
						e.printStackTrace();
					}
				}
				////// 2
			} else if (choice == 2) {
				try {
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
					psmt = conn.prepareStatement(sql);

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
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {

					try {
						if (rs != null)
							rs.close();
						if (psmt != null)
							psmt.close();
						if (conn != null)
							conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				/////////////// 3
			} else if (choice == 3) {
				try {
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
					System.out.print("삭제할 id 입력 : ");
					String delete_id = sc.next();

					// sql 통로 열기
					String sql = "delete from member where id=?";
					psmt = conn.prepareStatement(sql);

					psmt.setString(1, delete_id);

					// sql 통과 할 수 있는 코드
					int row = psmt.executeUpdate();
					if (row > 0) {
						System.out.println("delete success");
					} else {
						System.out.println("delete fail");

					}

				} catch (SQLException e) {
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

			} else if (choice == 4) {
				try {
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
					System.out.print("id 입력 : ");
					String update_id = sc.next();

					System.out.print("변경pw 입력 : ");
					int update_pw = sc.nextInt();

					// sql 통로 열기
					String sql = "update member set pw =? where id = ?";
					psmt = conn.prepareStatement(sql);

					// ?가 있는 경우 -> 물음표 채워주기
					// sql문의 물음표를 기준으로 인덱스 번호 1~ 부여하기
					psmt.setInt(1, update_pw);
					psmt.setString(2, update_id);

					// sql 통과 할 수 있는 코드
					int row = psmt.executeUpdate();
					if (row > 0) {
						System.out.println("update success");
					} else {
						System.out.println("update fail");

					}

				} catch (SQLException e) {
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

			} else {
				System.out.println("잘못 눌렀습니다!");
			}
		}
	}
}
