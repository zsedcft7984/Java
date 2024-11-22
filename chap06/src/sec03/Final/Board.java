package sec03.Final;

public class Board {
	String title;
	String content;
	String Writer;
	String date;
	int hitcount;
	

	Board(String title,String content){
		this(title,content,"로그인한 회원 아이디:","현재 컴퓨터 날짜:",0);
	}
	
	Board(String title,String content,String Writer){
		this(title,content,Writer,"현재 컴퓨터 날짜:",0);
	}
	
	Board(String title,String content,String Writer,String date){
		this(title,content,Writer,date,0);
	}
	
	Board(String title,String content,String Writer,String date,int hitcount){
		this.title =title;
		this.content =content;
		this.Writer =Writer;
		this.date = date;
		this.hitcount =hitcount;
	}
}
