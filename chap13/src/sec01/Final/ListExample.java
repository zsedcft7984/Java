package sec01.Final;

import java.util.*;

class Board{
	private String title;
	private String content;
	
	public Board(String title,String content){
		this.title =title;
		this.content = content;
	}
	public String getTitle() {return title;}
	public String getContent() {return content;}
}
// 		List<Board> list = new ArrayList<Board>(); 를 클래스로 구성해서 만드는거임 ㅇㅇ

class BoardDao{
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		for(int i =1; i<5; i++) {
			list.add(new Board("제목"+i,"내용"+i));
		}
		return list;
	}

	
		
}
public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board: list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
		
	}
}
