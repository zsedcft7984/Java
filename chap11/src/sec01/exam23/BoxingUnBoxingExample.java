package sec01.exam23;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//박싱 줄이 그어지는 이유는 대체할 코드가 있어서 혹은기능이 사라질 예정이라
		Integer obj1 =new Integer(100);
		Integer obj2 =new Integer("200");
		Integer obj3 =Integer.valueOf("300");
		
		int value1 =obj1.intValue();
		int value2 =obj2.intValue();
		int value3 =obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
