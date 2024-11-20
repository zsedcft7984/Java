package sec02Final06;

import java.util.Scanner;

public class count {

	public static void main(String[] args) throws Exception  {
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------");
			System.out.println("선택> ");
			
			int selection = Integer.parseInt(scanner.nextLine());
			
			if(selection == 1) {
				//작성위치
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}else if(selection == 2) {
				//작성위치
				if(scores.length == 0) {
					System.out.println("학생수가 입력되지 않았습니다.");
				}else {
					for(int i =0; i < scores.length;i++) {
						System.out.println("socre["+i+"]> ");
						int score = Integer.parseInt(scanner.nextLine());
						scores[i] = score;
					}		
				}				
			}else if(selection == 3) {
				//작성위치
				if(studentNum == 0) {
					System.out.println("리스트에 점수가 없습니다.");
				}else {
					for(int i =0; i < scores.length;i++) {
					System.out.println("socre["+i+"]>"+scores[i]);
					}
				}	
			}else if(selection == 4) {
				//작성위치
				int sum =0;
				int first =0;
				if(studentNum == 0) {
					System.out.println("리스트에 점수가 없습니다.");
				}else {
					for(int i =0; i < scores.length;i++) {
						sum += scores[i];
						if(scores[i]>first) {
							first = scores[i];
						}
					}
					double avg = (double) sum/studentNum;
					System.out.println("최고점수는:" + first);
					System.out.println("평균점수는:" + avg);
				}
			}else {
				run = false;
			}
		}
	
		System.out.println("프로그램 종료");

	}

}
