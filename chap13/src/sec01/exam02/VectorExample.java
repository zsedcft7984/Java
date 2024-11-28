package sec01.exam02;

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
	}

}
