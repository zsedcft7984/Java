package sec01.exam06;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬랙션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("권쥐용", 85);
		map.put("용준형", 75);
		map.put("형용사", 80);
		map.put("신용권", 95);
		System.out.println("총 Entry수 :"+ map.size());
		
		//객체 찾기
		System.out.println("\t형용사"+map.get("형용사"));
		System.out.println();
		
		//객체를 하나씩 처리(Set 이용)
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("형용사");
		System.out.println("총 Entry수 :"+ map.size());
		//객체를 하나씩 처리(Set 이용)
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>>entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry수 :"+ map.size());

	}

}
