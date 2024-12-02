package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복은 하나만 저장
		set.add("iBATIS");
		
		int size = set.size();
		System.err.println("총 객체 수: "+size);
		
		//Iterator
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String elemet = iterator.next();
			System.out.println("\t" + elemet);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.err.println("총 객체 수: "+set.size());
		
		iterator = set.iterator();
		for(String elemet : set) {
			System.out.println("\t"+elemet);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음");}
	}

}
