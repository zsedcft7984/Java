package sec01.exam06;

public class MyClass {
	RemoteControl rc = new Television();
	
	// 생성자
	MyClass(){}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
}
