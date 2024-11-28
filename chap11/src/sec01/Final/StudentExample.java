package sec01.Final;
import java.util.HashMap;
class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	//코드를 작성하시오
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student =(Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}

public class StudentExample {

	public static void main(String[] args) {
		//Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		//new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");
		
		//new Student("1")로 점수를 얻음
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 : " +score);
	}

}
