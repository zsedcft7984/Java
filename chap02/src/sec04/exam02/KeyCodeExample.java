package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		int KeyCode;
		//키입력의 코드
		KeyCode = System.in.read();
		System.out.println("KeyCode: " + KeyCode);
		// 캐리지 리턴 
		KeyCode = System.in.read();
		System.out.println("KeyCode: " + KeyCode);
		// 라인 피드
		KeyCode = System.in.read();
		System.out.println("KeyCode: " + KeyCode);

	}

}
