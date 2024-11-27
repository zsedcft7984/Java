package review.chap08;



interface Animal{
	void sound();
	void eat();
}

class Tiger implements Animal{
	public void sound() {
		System.out.println("어흥");
	}
	public void eat() {System.out.println("고기먹자");}
}

class rabit implements Animal{
	public void sound() {
		System.out.println("끼익");
	}
	public void eat() {System.out.println("풀먹");}
}
public class part082 {

	public static void main(String[] args) {
		Animal a1 = new Tiger();
		Animal a2 = new rabit();
		a1.eat();
		a2.eat();
		a1.sound();
		a2.sound();
		

	}

}
