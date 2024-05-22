package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.MemberDTO;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	

	// DAO란?
	// Data Access Object
	// 데이터 접근 객체
	// 데이터베이스에 접근하여 insert, delete, update, select 할 예정

	// DAO 객체 특징
	// 테이블 1개당 1개의 DAO객체를 가지고 있다.
	// 모든 기능은 메소드로 작성하게 된다.

	// 객체지향프로그래밍
	// 객체 간 서로 메세지를 주고 받는 프로그래밍
	

	// Connect 메소드
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "service";
			String pw = "12345";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

			conn = DriverManager.getConnection(url, user, pw);
			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	//close 하는 메소드
	private void allClose() {
		try {
			if (rs != null) rs.close();
			if (psmt != null) psmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// delete기능 메소드
	public int deleteMember(String delete_id) {		
		getConn();
		try {
			// sql통과 통로
			String sql = "delete from member where id = ?";
			psmt = conn.prepareStatement(sql);

			// ?채우기 - ?가 없으면 생략
			psmt.setString(1, delete_id);
			// sql통과 하세요!
			int row = psmt.executeUpdate();
			return row;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;  // 0은 executeUdate가 실행되지 않았다는 뜻이다.
		} finally {
			allClose();
		}
	}

	// update기능 메소드
	public int updateMember(String update_id, String update_pw) {
		getConn();
		try {
			
			// sql통과 통로
			String sql = "update member set pw = ? where id = ?";
			psmt = conn.prepareStatement(sql);

			// ?채우기 - ?가 없으면 생략
			psmt.setString(1, update_pw);
			psmt.setString(2, update_id);

			// sql통과 하세요!
			int row = psmt.executeUpdate();
			return row;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			allClose();
		}
	}

	// insert기능 메소드
	public int insertMember(MemberDTO mdto) {
		getConn();
		try {
			// sql통과 통로
			String sql = "insert into member values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			// ?채우기 - ?가 없으면 생략
			psmt.setString(1, mdto.getId());
			psmt.setString(2, mdto.getPw());
			psmt.setString(3, mdto.getName());
			psmt.setInt(4, mdto.getAge());

			// sql통과 하세요!
			int row = psmt.executeUpdate();
			return row;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			allClose();
		}
	}

	// select기능 메소드
	public ArrayList<MemberDTO> selectMember() {
		ArrayList<MemberDTO> dtoList = new ArrayList<MemberDTO>();
		
		getConn();
		try {
			// sql통과 통로
			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);

			// ?채우기 - ?가 없으면 생략

			// sql통과 하세요!
			rs = psmt.executeQuery();

			// select 한줄의 데이터 확인 rs.next()
			while (rs.next()) {
				String id = rs.getString(1);
				String table_pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				
				MemberDTO mdto = new MemberDTO(id, table_pw, name, age);
				dtoList.add(mdto);
			}
			
			return dtoList;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			allClose();
		}
	}

	public ArrayList<MemberDTO> selectSearchMember(String family_name) {
		
		//동적로딩
		//DB연결
		getConn();
		
		ArrayList<MemberDTO> dtoList = new ArrayList<MemberDTO>();
		
		//sql 통로 -psmt
		String sql = "select * from member where name like ?";
		//2번 방법은 sql내에 %입력
		//"select * from member where name like '%' || ? || '%'"
		try {
			psmt = conn.prepareStatement(sql);
			
			//?채워주기  -- like문 같은 경우 %가 필요
			//2가지 방법
			//1번 방법이 간단
			// psmt.set타입(index,"%"+변수+"%")
			psmt.setString(1, family_name+"%");
			
			//sql문 실행
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String select_id = rs.getString(1);
				String select_pw= rs.getString(2);
				String select_name= rs.getString(3);
				int select_age= rs.getInt(4);
				
				MemberDTO mdto = new MemberDTO(select_id, select_pw, select_name, select_age);
				dtoList.add(mdto);
			}
			return dtoList;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			allClose();
		}
	}
}
