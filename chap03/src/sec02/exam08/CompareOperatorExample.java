package sec02.exam08;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// 비교 연산자의 연산 수행시 피연산자의 타입을 일치시킴
		// float 과 double 은 실수 타입인데 컴퓨터는 실수의 표현의 어려움을 가짐
		// 따라서 결과를 보면 코드상 읽어지는 0.1은 같지만 실제로 비교하면 거짓의 값이 나옴
		// 따라서 double 을 float 로 맞춰야지 오류가 나지않음
		int v2 =1;
		double v3 = 1.0;
		System.out.println(v2==v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5);
		System.out.println((float)v4==v5);
	}

}
