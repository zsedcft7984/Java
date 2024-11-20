package Fianl;

import java.util.Scanner;

public class Scanner {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int balance =0;
		Scanner scanner = new Scanner (System.in);
		
		while(run) {
			System.out.println("-------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------");
			System.out.print("선택> ");
			
			String name = scanner.nextLine();
		
		}
		System.out.println("프로그램 종료");

	}

}
