package sec01.exam01;

class A {
	A() {System.out.println("A객체가 생성됨");}
	
	/**인스턴스 맴버 클래스**/ // 정적 내용은 사용 불가
	class B {
		B() {System.out.println("B객체가 생성됨");}
		int field1;
		//static int field2
		void method1() {}
		// static void  method2(){}
	}
	/**정적 클래스**/ // 정적 인스턴스 내용 모두 사용가능
	static class C{
		C() {System.out.println("C객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void  method2(){}
	}
	
	void method() {
		/**로컬 클래스**/
		class D{
			D() {System.out.println("D객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() {}
			//static void  method2(){}	
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
