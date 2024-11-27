package review.chap06;
/**
 * 생성자 : 클래스의 인스턴스 생성시 동작하는 기능을 정의한 코드 블로
 * => 자바의 클래스는 반드시 생성자를 하나 이상 가진다.
 * 따라서 클래스를 생성하면 우리눈에 보이지 않는 기본 생성자가 생긴다고 하든디
 * **/

class Fishbun{
	int price = 1000;
	String place = "골목";
	
	//
	Fishbun(){
		System.out.println("팥붕어빵 하나");
	}
	Fishbun(String inner){
		System.out.println(inner+"붕어빵 하나");
	}
	Fishbun(int price, String place){
		this.place = place;
		this.price =price;
		System.out.println(place+"에서"+"개당"+price+"에 판매합니다");
	}
}
public class part063 {

	public static void main(String[] args) {
		Fishbun f1= new Fishbun();
		Fishbun f2 = new Fishbun("슈크림");
		Fishbun f3 = new Fishbun(5000, "군대");

	
	}

}
