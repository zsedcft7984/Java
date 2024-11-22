package sec05.exam03;

public class Car {
	//필드
	int speed;

	void run() {
		System.out.println(speed +"km/h 로 달립니다.");
		}
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.speed = 60;
	
		mycar.run();
	}
}
