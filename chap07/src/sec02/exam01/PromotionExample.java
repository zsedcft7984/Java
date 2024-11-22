package sec02.exam01;
	
class Animal  {}
	
class Bird extends Animal {}
class Cat extends Animal {}
	
class Duck  extends Bird {}
class Ecat extends Cat {}

	public class PromotionExample {
		public static void main(String [] args) {
			Bird bird = new Bird();
			Cat cat = new Cat();
			Duck duck = new Duck();
			Ecat ecat = new Ecat();
			
			Animal a1 = bird;
			Animal a2 = cat;
			Animal a3 = duck;
			Animal a4 = ecat;
			 
			Bird b1 = duck;
			Cat c1 = ecat;
			
			
			
		}
}
	
