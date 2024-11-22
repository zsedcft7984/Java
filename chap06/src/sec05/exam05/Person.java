package sec05.exam05;

public class Person {
	//final 상수 값 설정할때 : 값을 변동할수 없는 인스턴스 변수
	//진정한 상수는 final static : 값을 변동할수 없는 정적변수
	final String nation = "korea";
	final String ssn;
	String name;
	
	public Person(String ssn,String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
