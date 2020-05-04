package ex;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person>{

	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showData() {
		System.out.println("이름 : " + this.name + "나이 : " + this.age);
	}

	@Override
	public int compareTo(Person o) {
		
		int result = 0;
		
//		if(this.age >o.age) {
//			result = 10000;  // 양수
//		}else if(this.age < o.age) {
//			result = -1; // 음수
//		}else {
//			result = 0;
//		}

		result = this.age-o.age;
		// result = (this.age-o.age;)*1  --> 위 코드의 역
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		TreeSet<Person> tree = new TreeSet<>();
		
		tree.add(new Person("Son", 27));
		tree.add(new Person("King", 30));
		tree.add(new Person("Lee", 27));
		
		Iterator<Person> itr = tree.iterator();
		
		while(itr.hasNext()) {
			itr.next().showData(); // next는 Person 타입의 참조값 반환
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
