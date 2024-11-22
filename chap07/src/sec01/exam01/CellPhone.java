package sec01.exam01;

public class CellPhone {
	//필드
	
	String model;
	String color;
	
	//생성자
	
	//메소드
	void powerOn() {System.out.println("전원을 겹니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("송신: "+message);}
	void reciveVoice(String message) {System.out.println("수신: "+message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
}
