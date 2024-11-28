package sec02.exam03;

class PrinThread2 extends Thread{
	
	public void run() {
		try {
			while(true) {
				System.out.println("실행중");
				Thread.sleep(1);
			}
		}catch(InterruptedException e){}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread =new PrinThread2();
		thread.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e){}		
		thread.interrupt();

		

	}
}
