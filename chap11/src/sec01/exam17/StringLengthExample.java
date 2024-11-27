package sec01.exam17;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "730641230123";
		int length = ssn.length()
;
		if(length == 13) {
			System.out.println("주민번호 자릿수가 맞네");
		}else {
			System.out.println("주민번호 자릿수가 다르네");

		}
	}

}
