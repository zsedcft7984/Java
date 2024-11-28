package sec01.exam04;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start(); // 스레드 실행
		
		for(int i =0 ; i <5;i++) {
			System.out.println("떙");
			try {Thread.sleep(500);} catch(Exception e){}
		}
	}

}
