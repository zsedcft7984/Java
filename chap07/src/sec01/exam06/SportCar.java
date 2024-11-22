package sec01.exam06;

public class SportCar extends Car {
	@Override
	public void speedUp() {speed += 10;}
	/*
	@Override
	public  void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;

	}
	*/ // 사용이 안되는 이유는 앞서 Car클래스에서 stop() 메서드를 final로 사용해서 그럼
	
}
