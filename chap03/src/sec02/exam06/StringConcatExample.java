package sec02.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		// 문자열 결합에서 문자열이 아닌 타입도 문자열로 바뀜
		// 문자열 결합과 숫자의 연산이 같이 있다면 문자열이 우선 계산됨 
		// str3 과 str4 비교하면 쉽게 확인가능
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDk" + 3 + 3.0;
		String str4 =  3 + 3.0 + "JDk";
		System.out.println(str3);
		System.out.println(str4);
	}

}
