package sec01.Final;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		
		System.out.println(obj1 == obj2);	//true
		System.out.println(obj3 == obj4);	//false
		//이유는 Integer 은 -128~127 까지 범위라서 3 4는 범위를 벗어났기때문에
	}

}
