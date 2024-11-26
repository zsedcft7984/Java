package sec02.exam02;

public class Anonymous {
	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {	
		@Override
		public void turnOn() {
			System.out.println("Tv를 켭니다");
		}
		@Override
		public void turnOff() {
			System.out.println("Tv를 끕니다");
		}
	};
	
	void method() {
		RemoteControl localval = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localval.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
