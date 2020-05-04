package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		
		HashSet<SimpleNumber> set = new HashSet<SimpleNumber>(); // <String> ==> equals("") : 문자열 비교해서 반환 (true, false)
		// HashSet<String> set = new HashSet<>();  -->  참조변수 선언시에만 String 정의해도 됨
		// Set<String> set = new HashSet<>(); // 다형성
		
		set.add(new SimpleNumber(10));
		set.add(new SimpleNumber(20));
		set.add(new SimpleNumber(10));
		
		System.out.println("저장된 데이터의 개수 : " + set.size()); // 데이터 개수 3개(Array였다면 4개)
	
		Iterator <SimpleNumber> itr = set.iterator(); // 값들이랑 인터페이스랑 이어주는 역할?????
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); // 출력되는건 저장의 순서를 가지고 있지 않음(List라면 저장순으로 First 부터 출력)
		}
	}
}

class SimpleNumber{
	
	int num;
	
	public SimpleNumber(int num) {
		this.num = num;
	}
	
	public String toString() { // 오버라이딩이라서 String 반환해야됨
		return String.valueOf(num);
	}

	// HashSet 의 동등비교과정
	// 1. hash 코드를 비교 같은 hash코드를 가진 객체를 기반으로 비교
	// 2. equals 메서드를 비교
	
	@Override // set.add(new SimpleNumber(10)); 두 개 있는 것을 구분하기 위해??
	public boolean equals(Object obj) { // 비교하고자 하는 equals는 obj에 저장되어있음?
		boolean result = false;
		
		// num 의 값을 비교
		if(obj instanceof SimpleNumber) { // obj 타입을 SimpleNumber 타입으로 형변환 --> obj 타입에는 변수가 없으므로 값을 비교할 수 없음
																					// SimpleNumber에 있는 num의 값으로 비교하고자 함
			SimpleNumber sm = (SimpleNumber)obj;
			result = this.num == sm.num; // 두 값을 비교
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





















