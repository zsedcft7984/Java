package sec03.exam02;

public class Korean {
	String nation = "대한민국";
	String name;
	int age;
	Korean(String n,int a){
		name = n;
		age = a;
	}
}
// n 과 a 는 가독성이 좋지 않은데 따라서 필드와 변수 이름을 같게 쓰려면 'this'를 이용함