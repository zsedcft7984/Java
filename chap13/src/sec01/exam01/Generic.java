package sec01.exam01;
// <> 제네릭 기호 : 타입 매개변수가 들어감 (관례적으로 대문자 하나로 사용)
// 타입 매개변수는 미정인 타입인 곳에 사용
class Box<T> {
	T obj; 	
	Box(T obj){
		this.obj =obj;
	}
}

class Apple {}
class Banana{}

public class Generic {
	public static void main(String[] args) {
		Box<Apple> applebox = new Box<Apple>(new Apple());
		
		applebox.obj = new Apple();
		//applebox.obj = new Banana();
		
		Box<Banana> bananabox = new Box<Banana>(new Banana());
		
		bananabox.obj = new Banana();
		//bananabox.obj = new Apple();
	}
}
