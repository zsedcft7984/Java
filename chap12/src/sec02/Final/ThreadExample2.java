package sec02.Final;
class MovieThread2 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadExample2 {

	public static void main(String[] args) {
		Thread thread = new MovieThread2();
		thread.setDaemon(true);
		thread.start();
		
		try {Thread.sleep(3000);}catch(InterruptedException e) {}
		
		thread.interrupt();
	}

}
