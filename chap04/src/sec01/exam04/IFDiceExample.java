package sec01.exam04;

public class IFDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1;
		
		if(num ==1) {
			System.out.println("1번");
		} else if(num == 2) {
			System.out.println("2번");
		} else if(num == 3) {
			System.out.println("3번");
		} else if(num == 4) {
			System.out.println("4번");
		} else if(num == 5) {
			System.out.println("5번");
		} else if(num == 6) {
			System.out.println("6번");
		}
	}
}
