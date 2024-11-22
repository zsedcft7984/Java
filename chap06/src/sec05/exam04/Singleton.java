package sec05.exam04;

public class Singleton {
	// 외부에서 못 건드리는 정적 필드
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	//정적 필드의 주소값을 반환하는 정적메소드
	static Singleton getInstance() {
		return singleton;
	}
}
