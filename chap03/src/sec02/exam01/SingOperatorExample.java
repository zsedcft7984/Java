package sec02.exam01;

public class SingOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= "+ result1);
		System.out.println("result2= "+ result2);
		
		byte b = 100;
		//부호 연산자의 결과는 int 타입 값으로 바뀌므로
		int result3 = -b;
		System.out.println("result3=" + result3);
	}

}
