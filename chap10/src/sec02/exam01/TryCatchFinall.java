package sec02.exam01;

public class TryCatchFinall {

	public static void main(String[] args) {
		try {		// 예외 처리할 내용
			Class clazz =Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e){	//예외발생시 매개변수
			
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
