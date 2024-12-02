package sec01.exam01;
/**
 * Collection 의 List 컬랙션의 ArrayList
 * <> 제레릭 이라고 하고 자유롭게 넣을수 있는 거
 * 	
 **/
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // 뒤에 <>의 
		//커스텀 클래스(사실 자료형 말고는 거의다) <> 를 사용할경우
		// add 시 add(new 커스텀클래스(""))로 써야됨
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총객체수: "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i =0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i =0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		
	}
	

}
