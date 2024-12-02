package sec01.Final;
import java.util.*;


class Student {
	public int studentNum;
	public String name;
	public Student(int studentNum,String name){
		this.studentNum =studentNum;
		this.name =name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return name.equals(name) &&(student.studentNum==studentNum) ;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
}

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"신용원"));
		set.add(new Student(1,"조민우"));
		
		
		Iterator<Student> iterator =set.iterator();
		while(iterator.hasNext()) {
			Student student =iterator.next();
			System.out.println(student.studentNum+":"+student.name);
		}
	}

}
