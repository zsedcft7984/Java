package sec01.exam02;

public class IFElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if (score>=90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.printf("당신의 점수는 %d 이고 등급은 A입니다.\n",score);			
		}else{
			System.out.println("점수가 90점보다 작습니다..");
			System.out.printf("당신의 점수는 %d 이고 등급은 B입니다.\n",score);	
		}
	}

}
