package sec04.exam01;

public class Calculator {
	//메소드
	// void는 리턴값이 없는 메소드
	void powerOn() {
		System.out.println("전원ON");
	}
	int plus(int x ,int y) {
		int result1 = x+y;
		return result1;
	}
	
	double divide(int x, int y) {
		double result2 = (double)x/(double)y;
		return result2;
	}
	
	void powerOff() {
		System.out.println("전원OFF");
	}
	
}
