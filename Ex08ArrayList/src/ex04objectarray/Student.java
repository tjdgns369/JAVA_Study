package ex04objectarray;

public class Student { //스튜던트클래스
	//field에 변수선언하기
	private String name;
	private int id;
	private int[] scores;
	private static int nextId = 1;
	
	public Student(String name,int[] scores) {//이름과 점수를 입력할 메서드 생성
		this.name=name; //this를 사용해서 메서드밖의 변수와 메서드 안의 변수를 구분하고 참조시킨다.
		this.id = nextId++;
		this.scores=new int[scores.length];
		for(int i=0;i<scores.length;i++) { //for문을 통해서 점수를 각배열에 넣어준다.
			this.scores[i]=scores[i];
		}
	}
	//접근제한자가 private임으로 getter를 통해 필요한 값을 꺼낸다.
	public String getName() {  //이름찾기
		return name;
	}

	public int getId() { //id찾기
		return id;
	}

	public int[] getScores() { //점수찾기??
		return scores;
	}
	
	public void setScores(int[] scores) { //점수를 추가하는  메서드
		this.scores = scores;
	}
	
	public double getAverage() { //평균값을 만드는 메서드
		int sum=0;
		for(int score : scores){
			sum+=score;
		}
		return (double) sum/scores.length;
	}
	
	public String getGrade() { //평균성적을 기준으로 등급을 나누는 메서드
		double average = getAverage();
		if(average >= 90) {
			return "A";
		}else if(average>=80) {
			return "B";
		}else if (average >= 70) {
            return "C";
        }else if (average >= 60) {
            return "D";
        }else {
            return "F";
        }
	}
	
	
	
}