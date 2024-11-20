package Fianl;

public class test {

	public static void main(String[] args) {
		// 1
		// 반복문의 종류는 : 1. for 2. while 3.do - while
		
		//2
		int sum1 = 0;
		for(int a =1; a<=100;a++) {
			if (a%3==0) {
				sum1 +=a;
			}
		}	
		System.out.println(sum1);
		
		//3
		int sum3 = 0;
		int dice1 = 0;
		int dice2 = 0;
		while(sum3 !=5) {
			dice1 = (int)(Math.random()*6) + 1;
			dice2 = (int)(Math.random()*6) + 1;
			sum3 = dice1+dice2;
			System.out.printf("주사위의 조합은 (%d,%d)입니다.\n",dice1,dice2);
		}
		System.out.printf("주사위의 조합이 (%d,%d)이므로 종료합니다.\n",dice1,dice2);
		
		//4
		for (int x =1; x <= 10; x++) {
			for(int y = 1; y<= 10; y++) {
				if((4*x+5*y)==60) {
					System.out.printf("(%d,%d)\n",x,y);
				}				
			}
		}
		
		//5
		for(int i=1; i<5;i++) {
			for(int j =1; j<i+1 ; j++) {
				System.out.print('*');
			}
			System.out.println(' ');
		}
		
		//5 +
		for (int layer = 1; layer < 5; layer++) {
			System.out.print('*');
		}
		
		//6
		for(int i=1; i<5;i++) {
			for(int j =5; j > i+1 ; j--){
				System.out.print(' '); // 빈칸 
			}
			for(int z =1; z < i+1 ; z++) {	
				System.out.print('*');	 // 별출력		
			}
			System.out.println(' ');	//줄바꿈			
		}
	}
}

		