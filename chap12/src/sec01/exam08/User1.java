package sec01.exam08;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User");
		this.calculator =calculator;
	}
	public void run() {
		calculator.setmemory(100);
	}
}
