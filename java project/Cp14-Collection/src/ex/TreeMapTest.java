package ex;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tMap = new TreeMap<>();
		tMap.put(1, "data1");
		tMap.put(3, "data3");
		tMap.put(5, "data5");
		tMap.put(4, "data4");
		tMap.put(2, "data2");
		
		// Map --> Collection
		// Map --> Set
		NavigableSet<Integer> navi = tMap.navigableKeySet(); // set을 구현하고 있는 클래스
		
		// 오름차순
		Iterator<Integer> itr = navi.iterator();
		
		while(itr.hasNext()) {
			System.out.println(tMap.get(itr.next()));
		}
		
		System.out.println("내림차순으로 정렬");
		// 내림차순
		itr = navi.descendingIterator();
	
		while(itr.hasNext()) {
			System.out.println(tMap.get(itr.next()));
		}
	}

}
