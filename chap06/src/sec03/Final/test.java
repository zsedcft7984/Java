package sec03.Final;

public class test {
	public static void main(String[] args) {
		// 1. x: 객체를 생성하려면 생성자가 반드시필요, o, o, o
		// 2.
		Member user1 = new Member("홍길동","hong");
		
		//3. Board.java 참고
		
		//4.
		Board board1 = new Board("title","content");
		Board board2 = new Board("title","content","writer");
		Board board3 = new Board("title","content","writer","date");
		Board board4 = new Board("title","content","writer","date",1);
		
	}

		

}
