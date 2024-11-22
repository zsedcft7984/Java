package sec05.exam05;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-124816","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";
		// p1.ssn = "9876543-1234567";
		p1.name ="동길홍";
		
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}
}
