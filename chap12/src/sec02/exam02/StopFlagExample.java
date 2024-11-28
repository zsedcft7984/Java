package sec02.exam02;

class PrinThread1 extends Thread{
	boolean stop;
	public void setStop(boolean stop) {
		this.stop =stop;
	}
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

public class StopFlagExample {

	public static void main(String[] args) {
		PrinThread1 printThread = new PrinThread1();
		printThread.start();
		
		try {Thread.sleep(100);} catch(InterruptedException e){}		

		printThread.setStop(true);

	}
}
