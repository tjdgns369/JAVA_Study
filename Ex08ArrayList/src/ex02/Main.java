package ex02;

import java.util.ArrayList;
import java.util.Scanner;

import ex01.Student;

public class Main {

	public static void main(String[] args) {
		// 객체배열만들기
		ArrayList<Student> Students = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("이름입력 : ");
			String name = sc.next();
			System.out.print("점수입력 : ");
			int score = sc.nextInt();

			Students.add(new Student(name, score));
			if (Students.size() == 3) {
				break;
			}
		}
		// 학생정보 출력
		for (Student x : Students) { // for-each문
			System.out.println(x.getname() + " : " + x.getscore());
		}

	}

}
