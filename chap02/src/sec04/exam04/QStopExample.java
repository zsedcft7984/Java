package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		// while 문이라 모든 키입력을 받게되는데 입력된 키입력 + CR + LF 만큼 나옴
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		System.out.print("시스템종료");
	}

}
