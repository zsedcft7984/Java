package sec01.exam01;
//extends (부모클래스 이름) 를 사용하면 부모클래스를 받아올 수 있다. 
public class DmbCellPhone extends CellPhone {
	//필드
	
	int channel;
		
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;		// CellPhon 클래스(부모클래스)로 부터 상속받은 필드
		this.color = color;		// CellPhon 클래스(부모클래스)로 부터 상속받은 필드
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel +"번 DMB방송을 수신합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel +"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB방송을 종료합니다.");
	}


}
