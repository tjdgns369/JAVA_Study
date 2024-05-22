package model;

public class MusicVO {
	//음악의 설계도 만들기
	// VO = Value Object
	// 필드만들기 -> 생성자를 이용해서 초기값을 가진 객체를 만들기.
	
	//제목, 가수명, 음악길이(초), 음악파일의 경로
	private String title;
	private String singer;
	private int playtime;
	private String musicPath;
	
	
	//생성자 (마우스 우클릭 -> 소스 -> Generate constructor using field클릭)
	public MusicVO(String title, String singer, int playtime, String musicPath) {
		this.title = title;
		this.singer = singer;
		this.playtime = playtime;
		this.musicPath = musicPath;
	}



	//Getter 만들기 (마우스 우클릭 -> 소스 -> Generate getter and setter클릭)
	public String getTitle() {
		return title;
	}


	public String getSinger() {
		return singer;
	}


	public int getPlaytime() {
		return playtime;
	}


	public String getMusicPath() {
		return musicPath;
	}
	
}
