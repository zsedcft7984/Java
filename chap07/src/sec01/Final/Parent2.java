package sec01.Final;

public class Parent2 {
	public String nation;
	
	public Parent2() {
		this("대한민국");
		System.out.println("Parent2() call");
	}
	public Parent2(String nation) {
		this.nation = nation;
		System.out.println("Parent2(Stirng nation) call");
	}
}
