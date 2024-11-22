package sec01.exam04;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAl =1;
	public static final int SUPERSONIC =2;
	public int flyMode = NORMAl;
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC){
			System.out.println("초음속 비행입니다.");
		}else {
		super.fly();
		}
	}
}
