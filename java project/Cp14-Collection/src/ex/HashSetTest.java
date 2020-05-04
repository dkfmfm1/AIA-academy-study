package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		// HashSet<String> set = new HashSet<String>(); // <String> ==> equals("") : 문자열 비교해서 반환 (true, false)
		// HashSet<String> set = new HashSet<>();  -->  참조변수 선언시에만 String 정의해도 됨
		Set<String> set = new HashSet<>(); // 다형성
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First");
		
		System.out.println("저장된 데이터의 개수 : " + set.size()); // 데이터 개수 3개(Array였다면 4개)
	
		Iterator <String> itr = set.iterator(); // 값들이랑 인터페이스랑 이어주는 역할?????
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); // 출력되는건 저장의 순서를 가지고 있지 않음(List라면 저장순으로 First 부터 출력)
		}
	}

}
