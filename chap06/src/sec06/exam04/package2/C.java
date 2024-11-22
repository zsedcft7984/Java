package sec06.exam04.package2;

import sec06.exam04.package1.A;
public class C {
	A field1 = new A(true);
	//A field2 = new A(1); - default 생성자는 접근 불가 - 다른 패키지라
	//A field3 = new A("문자열"); - private 생성자 접근 불가- 외부 파일에서는 접근불가

}
