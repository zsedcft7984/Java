package sec02.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1="+ result1);
		
		int result2 = v1 - v2;
		System.out.println("result2="+ result2);
		
		int result3 = v1 * v2;
		System.out.println("result3="+ result3);

		int result4 = v1 / v2;
		System.out.println("result4="+ result4);

		int result5 = v1 % v2;
		System.out.println("result5="+ result5);
		// result4 는 정수 정수의 나누기라 소숫점이 나오지 않음
		// 따라서 v1 과 결과를 실수로 바꾸주고 나누면 실수의 값이 나옴
		double result6 = (double) v1 / v2;
		System.out.println("result6="+ result6);
	}

}
