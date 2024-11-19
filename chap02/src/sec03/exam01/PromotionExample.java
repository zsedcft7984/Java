package sec03.exam01;
public class PromotionExample {
	public static void main(String[] args) {
		//자동 타입 변환 : 메모리 범위가 작은데서 -> 큰데 로 변환하는것은 문제없이 자동으로 됨
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: "+intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: "+intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: "+ longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: "+ floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: "+ doubleValue);
		
	}
}
