package sec01.exam05;

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested naested = outter.new Nested();
		naested.print();
	}
}
