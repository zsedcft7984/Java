package sec01.Final;

public class Child2 extends Parent2 {
	private String name;
	
	public Child2() {
		this("홍길동");
		System.out.println("Child2() call");
	}
	
	public Child2(String name) {
		this.name =name;
		System.out.println("Child2(String name) call");

	}
}
