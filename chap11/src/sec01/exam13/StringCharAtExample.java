package sec01.exam13;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "990503-140999";
		char sex =ssn.charAt(7);
		switch(sex){
		case '1':
		case '3':
			System.out.println("남자 입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다");
			break;
		}
	}

}
