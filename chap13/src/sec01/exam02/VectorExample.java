package sec01.exam02;

import java.util.*;

class Board{
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject =subject;
		this.content =content;
		this.writer =writer;
	}
}

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));		
		list.add(new Board("제목5","내용5","글쓴이5"));
		for(int i =0;i<list.size();i++) {
			Board b = list.get(i);
			System.out.println(b.subject+"\t"+b.content+"\t"+b.writer);
		}
		System.out.println();
		list.remove(2);
		list.remove(2);
		for(int i =0;i<list.size();i++) {
			Board b = list.get(i);
			System.out.println(b.subject+"\t"+b.content+"\t"+b.writer);
		}
	}

}
