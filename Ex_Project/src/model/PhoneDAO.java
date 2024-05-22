package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Phone_DTO.PhoneDTO;

public class PhoneDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	// connect
	private void getConn() {
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

	// close
	private void allClose() {
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

	// 1. 전체조회
	public ArrayList<PhoneDTO> selectPhone() {
		ArrayList<PhoneDTO> dtoList = new ArrayList<PhoneDTO>();

		getConn();
		try {
			// sql통과 통로
			String sql = "select * from phone";
			psmt = conn.prepareStatement(sql);

			// sql통과 하세요!
			rs = psmt.executeQuery();

			// select 한줄의 데이터 확인 rs.next()
			while (rs.next()) {
				String name = rs.getString(1);
				String phone_number = rs.getString(2);
				int age = rs.getInt(3);

				PhoneDTO pdto = new PhoneDTO(name, phone_number, age);
				dtoList.add(pdto);
			}
			return dtoList;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			allClose();
		}
	}

	// 2. insert
	public int insertPhone(PhoneDTO pdto) {
		getConn();
		String sql = "insert into phone values(?,?,?)";
		try {
			// sql통과 통로
			psmt = conn.prepareStatement(sql);

			// ?채우기 - ?가 없으면 생략
			psmt.setString(1, pdto.getName());
			psmt.setString(2, pdto.getPhoneNumber());
			psmt.setInt(3, pdto.getAge());

			// sql통과 하세요!
			return psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			allClose();
		}
	}

	// 3.delete
	public int deletePhone(String delete_name) {
		getConn();
		try {
			String sql = "delete from phone where id =? ";
			psmt = conn.prepareStatement(sql);

			// ?
			psmt.setString(1, delete_name);

			int row = psmt.executeUpdate();
			return row;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			allClose();
		}
	}

	// 4.update
	public int updatePhone(String update_name, String update_number) {
		getConn();

		try {
			String sql = "update Phone set name=? phone_number=?  ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, update_name);
			psmt.setString(2, update_number);

			int row = psmt.executeUpdate();
			return row;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			allClose();
		}
	}

	// 5.이름으로 번호 찾기
	public ArrayList<PhoneDTO> searchName(String search_name) {
		
		getConn();
		ArrayList<PhoneDTO> dtoList = new ArrayList<PhoneDTO>();
		
		try {
			String sql = "select * from phone where name = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, search_name);
			rs = psmt.executeQuery();

			// ?채우기 - ?가 없으면 생략

			// select 한줄의 데이터 확인 rs.next()
			while (rs.next()) {
				String name = rs.getString(1);
				String phone_number = rs.getString(2);
				int age = rs.getInt(3);

				PhoneDTO pdto = new PhoneDTO(name, phone_number, age);
				dtoList.add(pdto);
			}
			
			
			return dtoList;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			allClose();
		}

	}

}
