package sec02.Final;

import java.util.Scanner;

public class testscaner {

	public static void main(String[] args) throws Exception {
		// 9 118p책참조
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double num1 = Double.parseDouble(scanner1.nextLine());
		
		System.out.print("두 번째 수: ");
		double num2 = Double.parseDouble(scanner1.nextLine());
		
		System.out.println("---------------------");
		if(num2 != 0.0) {
			System.out.println("결과: " + (num1/num2));
		} else {
			System.out.println("결과: 무한대");
		}
		// 11 
		Scanner scanner2 = new Scanner (System.in);
		
		System.out.print("아이디:");
		String name = scanner2.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner2.nextLine();
		
		int password = Integer.parseInt(strPassword);

		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패: 패스워드가 틀렸습니다.");
			}
		}else {
			System.out.println("로그인 실패: 아이디가 존재하지 않습니다..");
		}
	}
}
