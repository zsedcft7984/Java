package sec02.Final;
class MovieThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
public class ThreadExample1 {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		
		thread.interrupt();
	}

}
