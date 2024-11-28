package sec01.exam07;

public class User2 extends Thread{
private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("User");
		this.calculator =calculator;
	}
	public void run() {
		calculator.setMemory(50);
	}
}
