package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setSpeed(-50);
		//잘못된 속도 변경
		System.out.println("현재속도 :"+myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		System.out.println("현재속도 :"+myCar.getSpeed());

		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도 :"+myCar.getSpeed());

	}

}
