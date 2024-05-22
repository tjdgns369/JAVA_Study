package ex04objectarray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        StudentManager manager = new StudentManager();

	        while (true) {
	            System.out.println("\n[학생 성적관리 프로그램]");
	            System.out.println("1. 학생 추가");
	            System.out.println("2. 학생 검색");
	            System.out.println("3. 학생 정보 수정");
	            System.out.println("4. 학생 삭제");
	            System.out.println("5. 종료");
	            System.out.print("> ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("학생 이름: ");
	                    String name = scanner.nextLine();

	                    System.out.print("성적을 입력하세요 (예: 85 92 78): ");
	                    String[] scoresString = scanner.nextLine().split(" ");
	                    int[] scores = new int[scoresString.length];
	                    for (int i = 0; i < scoresString.length; i++) {
	                        scores[i] = Integer.parseInt(scoresString[i]);
	                    }

	                    manager.addStudent(new Student(name, scores));

	                    break;

	                case 2:
	                    System.out.print("검색어: ");
	                    String keyword = scanner.nextLine();

	                    manager.searchStudent(keyword);

	                    break;

	                case 3:
	                    System.out.print("수정할 학생 번호: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine();

	                    System.out.print("새로운 성적을 입력하세요 (예: 85 92 78): ");
	                    scoresString = scanner.nextLine().split(" ");
	                    scores = new int[scoresString.length];
	                    for (int i = 0; i < scoresString.length; i++) {
	                        scores[i] = Integer.parseInt(scoresString[i]);
	                    }

	                    manager.updateStudent(id, scores);

	                    break;

	                case 4:
	                    System.out.print("삭제할 학생 번호: ");
	                    id = scanner.nextInt();
	                    scanner.nextLine();

	                    manager.deleteStudent(id);

	                    break;

	                case 5:
	                    System.out.println("프로그램을 종료합니다.");
	                    return;

	                default:
	                    System.out.println("잘못된 메뉴 선택입니다.");
	                    break;
	            }
	        }

	}

}
