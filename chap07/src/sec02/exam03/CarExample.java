package sec02.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // Car 클래스 인스턴스 값 가져옴(타이어 초기값있음)
		
		for (int i =1; i <=5; i++) {// 모든 바퀴에 대해서 동작 할려고 
			int problemLocation =car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽",15);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽",15);
				break;
			case 4:
				System.out.println("뒤오른쪽 HankookTire 교체");
				car.backRightTire = new HankookTire("뒤오른쪽",15);
				break;
			}
			System.out.println("---------------------");
		}
		
		
	}

}
