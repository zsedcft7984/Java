package sec01.exam02;

public class Student extends People{
	//필드
	public int studentNo;
	//생성자
	//부모에 생성자가 있기때문에 super(객체)를 해주어야 한다.
	public Student (String name, String ssn, int studenNo) {
		super(name, ssn);
		this.studentNo = studenNo;
	}
}
