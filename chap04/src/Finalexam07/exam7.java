package Finalexam07;

import java.util.Scanner;


public class exam7 {

	public static void main(String[] args) throws Exception {

		boolean run = true;
		int balance =0;
		Scanner scanner = new Scanner (System.in);
		
	
		while(run) {
			System.out.println("-------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------");
			System.out.print("선택> ");
			
			int selection = Integer.parseInt(scanner.nextLine());
			
			/* if - else if - else 사용
			if(selection == 1) {
				System.out.println("예금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance += money;
			}else if(selection == 2) {
				System.out.println("출금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				if (money >balance) {
					System.out.println("잔고가 부족합니다.");
				}else {
					balance -= money;
				}
			}else if(selection == 3) {
				System.out.printf("잔고> %d\n",balance);
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			*/
			
			
			switch(selection) {
			case 1:
				System.out.println("예금액> ");
				int input = Integer.parseInt(scanner.nextLine());
				balance += input;
				break;
			case 2:
				System.out.println("출금액> ");
				int output = Integer.parseInt(scanner.nextLine());
				if (output >balance) {
					System.out.println("잔고가 부족합니다.");
				}else {
					balance -= output;
				}
				break;
			case 3:
				System.out.printf("잔고> %d\n",balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;

			}
		
		}
		

	}

}