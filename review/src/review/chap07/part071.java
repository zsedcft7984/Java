package review.chap07;

//부모 클래스
class Bread{
	String name;
	void setName(String name) {
		this.name = name;
	}
}
//자식클래스
class bb extends Bread{
	@Override
	void setName(String name) {
		this.name = name;
		name = "튀소";
	}
}




public class part071 {

	public static void main(String[] args) {
		Bread bread = new Bread();
		

	}

}
