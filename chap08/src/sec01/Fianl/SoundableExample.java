package sec01.Fianl;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] arg) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
