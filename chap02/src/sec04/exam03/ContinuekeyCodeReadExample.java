package sec04.exam03;

public class ContinuekeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		// while 문이라 모든 키입력을 받게되는데 입력된 키입력 + CR + LF 만큼 나옴
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
		}
	}

}

		