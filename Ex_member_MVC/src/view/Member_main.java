package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import DTO.MemberDTO;
import model.MemberDAO;

public class Member_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("회원관리 프로그램");
			System.out.println("1.전체 회원 조회 2.회원가입 3.회원정보 삭제 4. 비밀번호 수정 5.검색 조회 6.종료");

			int choice = sc.nextInt();
			if (choice == 6) {
				System.out.println("프로그램 종료");
				break;
			}else if(choice == 5) {
				System.out.print("검색할 성을 입력하세요>> ");
				String  family_name=sc.next();
				MemberDAO mdao = new MemberDAO();
				ArrayList<MemberDTO>dtoList=mdao.selectSearchMember(family_name);
				
				for(MemberDTO e : dtoList) {
					System.out.println("id : "+ e.getId());
					System.out.println("pw : "+ e.getPw());
					System.out.println("name: "+ e.getName());
					System.out.println("age : "+ e.getAge());
					System.out.println("==========================");
				}
			} else if (choice == 1) {
				MemberDAO mdao = new MemberDAO();
				ArrayList<MemberDTO>dtoList = mdao.selectMember();
				for(int i=0; i<dtoList.size(); i++) {
					//System.out.println(dtoList.get(i)); _ 주소값 출력됨
					System.out.println("id : "+dtoList.get(i).getId());
					System.out.println("pw : "+dtoList.get(i).getPw());
					System.out.println("name : "+dtoList.get(i).getName());
					System.out.println("age : "+dtoList.get(i).getAge());
				}

			} else if (choice == 2) {
				System.out.println("회원가입 페이지 입니다.");

				System.out.print("id를 입력하세요 :");
				String join_id = sc.next();

				System.out.print("pw를 입력하세요 :");
				String join_pw = sc.next();

				System.out.print("name를 입력하세요 :");
				String join_name = sc.next();

				System.out.print("age를 입력하세요 :");
				int join_age = sc.nextInt();

				MemberDAO mdao = new MemberDAO();
				MemberDTO mdto = new MemberDTO(join_id, join_pw, join_name, join_age);
		
			    int row = mdao.insertMember(mdto);
				
				if (row > 0) {
					System.out.println("insert success");
				} else {
					System.out.println("insert fail");
				}

			} else if (choice == 3) {
				System.out.println("회원정보 삭제 페이지 입니다.");

				System.out.print("삭제할 id를 입력하세요 :");
				String delete_id = sc.next();

				MemberDAO mdao = new MemberDAO();
				int row = mdao.deleteMember(delete_id);
				
				if (row > 0) {
					System.out.println("delete success");
				} else {
					System.out.println("delete fail");
				}

			} else if (choice == 4) {
				System.out.println("회원정보 수정 페이지 입니다.");

				System.out.print("id를 입력하세요 :");
				String update_id = sc.next();

				System.out.print("pw를 입력하세요 :");
				String update_pw = sc.next();

				MemberDAO mdao = new MemberDAO();
				int row = mdao.updateMember(update_id, update_pw);
				
				if (row > 0) {
					System.out.println("update success");
				} else {
					System.out.println("update fail");
				}

			} else {
				System.out.println("잘못 눌렀습니다!");
			}
		}
	}
}
