package sec01.exam06;

public class SmartPhone {
	private String compay;
	private String os;
	
	public SmartPhone(String compay, String os) {
		this.compay = compay;
		this.os = os;
	}
	@Override
	public String toString() {
		return compay +"," +os;
	}
}
