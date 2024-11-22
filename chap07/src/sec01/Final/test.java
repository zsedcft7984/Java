package sec01.Final;

public class test {
	// 1.  X : 다중상속은 여러 부모를 받아 쓴다느 것 ,o, o ,o 
	
	// 2.  o, x : 접근제한 강화 불가 o, o,
	
	// 3. x, o, o, x 
	
	// 4. 컴파일 오류는  this.name = name; 에서 발생한다;
	// 이유는 부모의 생성자에서 사용한 name을 사용핼줄려면 super(name); 을 써줘야함
	
	// 5. 출력결과
	// Parent2(Stirng nation) call
	// Parent2() call
	// Child2(String name) call
	// Child2() call
	// 결과적으로 자식 클래스를 생성될때 부모가 먼저 생성되고 자식이 생성되는 식으로 진행됨을 알 수 있따.
}
