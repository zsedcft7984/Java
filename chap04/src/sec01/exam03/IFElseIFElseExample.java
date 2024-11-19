package sec01.exam03;

public class IFElseIFElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if (score>=90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.printf("당신의 점수는 %d 이고 등급은 A입니다.\n",score);			
		}else if (score>=80){
			System.out.println("점수가 80점보다 큽니다.");
			System.out.printf("당신의 점수는 %d 이고 등급은 B입니다.\n",score);	
		}else if (score>=70){
			System.out.println("점수가 70점보다 큽니다.");
			System.out.printf("당신의 점수는 %d 이고 등급은 C입니다.\n",score);	
		}else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.printf("당신의 점수는 %d 이고 등급은 D입니다.\n",score);
		}
	}

}
