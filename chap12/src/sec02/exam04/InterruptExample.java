package sec02.exam04;

class PrinThread2 extends Thread{
	
	public void run() {
		while(true) {
		System.out.println("실행중");
		if(Thread.interrupted()){
			break;
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
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
