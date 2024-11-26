package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A(); 	
		// 인스턴스 맴버는 우선 이전 객체를 먼저 생성해저야됨
		//인스턴스 멤버 클래스 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멘버 클래스 생성
		A.C c = new A.C();
		c.field1 =3;
		c.method1();
		A.C.field2 =3;
		A.C.method2();
		
		//로컬 클래스 객체 생성
		a.method();
		
		

	}

}
