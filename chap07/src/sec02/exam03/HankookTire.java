package sec02.exam03;

public class HankookTire extends Tire{
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override //부모의 메소드를 재정의
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"HankookTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
	}else {
		System.out.println("***"+location+"HankookTire 펑크 ***");
		return  false;
	}		
	}
	
	
}
