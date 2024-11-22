package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method3();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		
		//parent.method3(); parent는 Parent 타입으로 바뀐상태임
		// 추가적으로 부모 타입이 자식 타입의 객체를 참조하려 할때 강제 변환을 통해 해결가능
		Child c = (Child) parent;
		c.method3();
		

	}

}
