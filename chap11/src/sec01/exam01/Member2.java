package sec01.exam01;

public class Member2 {
	public static void main(String[] args) {

	Object obj1 = new Object();
	Object obj2 = new Object();
	
	String str1 = new String();
	String str2 = new String();

	
	boolean result1 = obj1.equals(obj2); // 주소비교
	boolean result2 = (obj1==obj2);	// 주소비교
	
	boolean result3 = str1.equals(str2); // 문자열 비교로 override됨
	boolean result4 = (str1==str2);// 주소비교
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	
	
	}
	
}
