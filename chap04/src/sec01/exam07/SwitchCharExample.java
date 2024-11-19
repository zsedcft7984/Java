package sec01.exam07;

public class SwitchCharExample {
		public static void main(String[] args) {
			char grade = 'B';
				
			switch(grade) {
				case 'A':
					System.out.println("우수회원 입당");
					break;
				case 'B', 'b':
					System.out.println("일반회원 입당");
					break;

				default:
					System.out.println("손님 입당.");
					break;
			}

		}

	}
