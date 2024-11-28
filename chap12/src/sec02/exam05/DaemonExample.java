package sec02.exam05;
class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {break;}
			save();
		}
		
	} 

}
public class DaemonExample {
	public static void main(String[] args) {		
		AutoSaveThread autoSaveThread =new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("메인 스레드 종료");
	}

}
