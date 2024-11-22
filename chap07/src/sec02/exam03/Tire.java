package sec02.exam03;

public class Tire {
	//필드
	public int maxRotation;			//최대 회전수(타이머 수명)
	public int accumulatedRotation; //누적 회전수
	public String location; 		//타이머 위치
	
	//생성자 
	public Tire(String location, int maxRotation) { //필드의 값을 초기화해줌
		this.location = location;			
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"Tire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
	}else {
		System.out.println("***"+location+"Tire 펑크 ***");
		return  false;
	}		
	}
}
