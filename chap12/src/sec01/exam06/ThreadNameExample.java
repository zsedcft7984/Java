package sec01.exam06;
class ThreadA extends Thread{
	public ThreadA() {
		setName("THreadA");
	}
	@Override
	public void run() {
		for(int i =0; i < 2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
		
	}
}
class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}
	@Override
	public void run() {
		for(int i =0; i < 2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}		
	}
}
public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // 현제 쓰레드에 대한 참조
		System.out.println("메인 스레드 이름: "+mainThread.getName());
		
		ThreadA threadA =new ThreadA();
		System.out.println("작업 스레드 이름: "+threadA.getName());
		threadA.start();
		
		ThreadB threadB =new ThreadB();
		System.out.println("작업 스레드 이름: "+threadB.getName());
		threadB.start();
		
	}

}
