package sec01.exam08;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setmemory(int memory) {
		this.memory =memory;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		System.out.println(Thread.currentThread().getName() + ": " +this.memory);
	}
}
