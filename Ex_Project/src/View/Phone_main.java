package View;

import java.util.ArrayList;
import java.util.Scanner;

import Phone_DTO.PhoneDTO;
import model.PhoneDAO;

public class Phone_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneDAO pdao = new PhoneDAO();
		
		while(true) {
			System.out.println("====== 전화번호 관리부 ======");
			System.out.println("1.전체 번호 조회 2.번호 추가 3.번호 삭제 4.번호 수정  5.이름으로 번호 찾기6. 종료합니다.");
			
			int choice = sc.nextInt();
			if(choice == 6) {
				System.out.println("종료합니다.");
				break;
				
			}else if(choice == 1) { // 전체 번호 조회
				PhoneDAO mdao = new PhoneDAO();
				ArrayList<PhoneDTO> dtoList = new ArrayList<PhoneDTO>();
				for(int i=0; i<dtoList.size(); i++) {
					//System.out.println(dtoList.get(i)); _ 주소값 출력됨
					System.out.println("전체 번호 조회 페이지 입니다.");
					System.out.println("이름 : "+dtoList.get(i).getName());
					System.out.println("번호 : "+dtoList.get(i).getPhoneNumber());
					System.out.println("나이 : "+dtoList.get(i).getAge());
				}
				
				
			}else if(choice == 2) {
				System.out.println("번호추가 페이지 입니다.");
				System.out.print("이름를 입력하세요 :");
				String insert_name = sc.next();
				System.out.print("번호를 입력하세요 :");
				String  insert_number = sc.next();
				System.out.print("나이를 입력하세요 :");
				int insert_age = sc.nextInt();

				PhoneDTO pdto = new PhoneDTO(insert_name, insert_number, insert_age);
				int row = pdao.insertPhone(pdto);
				
				if (row > 0) {
					System.out.println("insert success");
				} else {
					System.out.println("insert fail");
				}
				
			}else if(choice == 3) {
				System.out.println("전화번호 삭제입니다.");
				
				System.out.print("삭제할 이름을 입력하세요!");
				String delete_id =sc.next();
				
				PhoneDAO pdao1 = new PhoneDAO();
				int row = pdao1.deletePhone(delete_id);
				
				if (row > 0) {
					System.out.println("delete success");
				} else {
					System.out.println("delete fail");
				}
			}else if(choice == 4) {
				
				System.out.println("번호 수정 페이지 입니다.");

				System.out.print("수정 할 이름을 입력하세요 :");
				String update_id = sc.next();

				System.out.print("수정 할 번호를 입력하세요 :");
				String update_pw = sc.next();

				PhoneDAO mdao = new PhoneDAO();
				int row = mdao.updatePhone(update_id, update_pw);
				
				if (row > 0) {
					System.out.println("update success");
				} else {
					System.out.println("update fail");
				}
				
			}else if(choice == 5) {
				System.out.print("검색할 이름 입력: ");
				String search_name = sc.next();
				pdao = new PhoneDAO();
				ArrayList<PhoneDTO> dtoList = pdao.searchName(search_name);
				
				for(int i=0; i<dtoList.size(); i++) {
					//System.out.println(dtoList.get(i)); _ 주소값 출력됨
					System.out.println("이름으로 전화번호 검색입니다.");
					System.out.println("번호 : "+dtoList.get(i).getPhoneNumber());
				}
				
				
			}
						
		}

	}

}

