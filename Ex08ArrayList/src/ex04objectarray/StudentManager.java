package ex04objectarray;

public class StudentManager { //학생 성적관리 기능 메서드를 생성할 class
	private static final int MAX_STUDENTS = 100;
    private Student[] students;
    private int numStudents;

    public StudentManager() {
        students = new Student[MAX_STUDENTS];
        numStudents = 0;
    }

    public void addStudent(Student student) { //학생추가 메서드
        if (numStudents >= MAX_STUDENTS) { //최대 100명까지의 학생만 추가할수 있도록
            System.out.println("학생 목록이 가득 찼습니다.");
            return;
        }

        students[numStudents++] = student;
        System.out.println("학생이 추가되었습니다.");
    }

    public void searchStudent(String keyword) { //학생검색 메서드
        boolean found = false;

        for (int i = 0; i < numStudents; i++) {
            if (students[i].getName().contains(keyword)) { //keyword로 들어온 이름과 일치하는 이름이 있다면 일치하는 정보를 출력해준다.
                System.out.printf("%d - %s (평균 %.2f, 학점 %s)\n", students[i].getId(), students[i].getName(), 
                                        students[i].getAverage(), students[i].getGrade());
                found = true;
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void updateStudent(int id, int[] scores) { // 수정기능 메서드
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId() == id) {
                students[i].setScores(scores);
                System.out.println("학생 정보가 수정되었습니다.");
                return;
            }
        }

        System.out.println("해당하는 번호를 가진 학생이 없습니다.");
    }

    public void deleteStudent(int id) { //삭제기능 메서드
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < numStudents - 1; j++) {
                    students[j] = students[j+1];
                }
                numStudents--;
                System.out.println("학생이 삭제되었습니다.");
                return;
            }
        }

        System.out.println("해당하는 번호를 가진 학생이 없습니다.");
    }
}

