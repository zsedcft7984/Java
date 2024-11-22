package sec01.exam03;

public class Computer extends Calculator{
	// @Override 를 가리켜 annotation 이라고 한다
	// 이는 아래의 코드가 어떤 용도인지를 알려준느 역할이다.
	// 기본적으로 생략을 해도 되는 것이지만 compiler에게 학습을시켜 성능항상을 위해 씀
	@Override
	double aradCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
