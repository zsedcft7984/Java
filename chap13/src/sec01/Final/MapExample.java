package sec01.Final;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> data :set) {
			if(maxScore < data.getValue()) {
				maxScore =data.getValue();
				name = data.getKey();
			}
			totalScore += data.getValue();
		}
		 
		System.out.println(name);
		System.out.println(maxScore);
		System.out.println(totalScore/map.size());
	}

}
