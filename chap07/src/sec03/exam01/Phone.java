package sec03.exam01;
// 추상클래스 : 하위 클래스가 공통으로 같는 필드, 메소드 사용
public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("휴대폰의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("휴대폰의 전원을 끕니다.");
	}
}
