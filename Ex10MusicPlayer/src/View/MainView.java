package View;

import java.util.Scanner;

import controller.MainController;
import model.MusicVO;

public class MainView {

	public static void main(String[] args) {
		//View의 역할 :  사용자의 인터페이스(UI; User Interface)
		//기능을 사용자가 선택할 수 있도록 만들기.
		//재생, 정지, 다음곡, 이전곡, 검색, 종료
		
		Scanner sc = new Scanner(System.in);
		MainController c = new MainController();
		int sel; //사용자의 선택
		while(true) {
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]음악찾기 [6]종료 [7]랜덤재생 [8]전체리스트 "
					          + "[9]음악삭제 [10]음악추가 >> ");
			sel = sc.nextInt();
		
			switch(sel) {
			case 1 :
				c.play();
				break;
			case 2 :
				c.stop();
				break;
			case 3 :
				c.next();
				break;
			case 4 :
				c.pre();
				break;
			case 5 :
				System.out.print("재생할 음악이름 >> ");
				c.search(sc.next());
				break;
			case 7 :
				c.ranPlay();
				break;
			case 8 :
				c.list();
				break;
			case 9 :
				System.out.print("삭제할 음악이름>> ");
				c.delete(sc.next());
				System.out.println("삭제되었습니다.");
				break;
			case 10 :
				 System.out.print("제목 >>");
		         String title = sc.next();
		         System.out.print("가수 >>");
		         String singer = sc.next();
		         System.out.print("플레이타임 >>");
		         int playTime = sc.nextInt();
		         sc.nextLine();
		         System.out.print("폴더 >>");
		         String folder = sc.nextLine();
		            // ../Ex10MusicPlayer/src/musicList/musicList/IVE 아이브 I AM.mp3 //
		         MusicVO mvo = new MusicVO(title, singer, playTime, folder);
		         c.insert(mvo);
		         System.out.println("음악이 추가되었습니다.");
		         break;
			case 6 :
				System.out.println("종료되었습니다.");
				break;
			default :
				break;
			}
		}
	}
}
