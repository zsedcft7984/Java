package sec01.exam09;
//스킵권장
class Car{}
public class ClassExample {

	public static void main(String[] args) {
		//1.
		Class clazz = Car.class;
		
		//2.
		//Class clazz = Class.forName("sec01.exam09.Car");
		
		//3.
		//Car car = new Car();
		//Class clazz = Car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());

	}

}
