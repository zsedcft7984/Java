package sec02.exam06;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

class Board implements Serializable{
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	public Board(int bno, String title,String content,String writer,Date date) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	
	public int getBno(){return bno;}
	public void setBno(int bno) {this.bno = bno;}
	public String getTitle() {return title;}
	public void setTitle(String title) { this.title = title;}
	public String getContent(){return content;}
	public void setContent(String content){this.content = content;}
	public String getWriter(){return writer;}
	public void setWriter(String writer){this.writer = content;}
	public Date getDate(){return date;}
	public void setDate(Date date){this.date = date;}	
}

public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//항상된 for문
		for(Board board : list) { 
			System.out.println(
			board.getBno()+"\t"+board.getTitle()+"\t"+board.getContent()+"\t"
			+board.getWriter()+"\t"+sdf.format(board.getDate())
			);
		}
	}

	public static void writeList() throws Exception{
		List<Board> list = new ArrayList<>();
		
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception{
		FileInputStream fis = new FileInputStream("board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;

	}
}
