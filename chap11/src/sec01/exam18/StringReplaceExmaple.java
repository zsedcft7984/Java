package sec01.exam18;

public class StringReplaceExmaple {
	public static void main(String[] args) {
	String oldStr = "자바는 객체 지향 언어, 풍부한 API제공";
	String newStr = oldStr.replace("자바","JAVA");
	System.out.println(oldStr);
	System.out.println(newStr);
	}
}
