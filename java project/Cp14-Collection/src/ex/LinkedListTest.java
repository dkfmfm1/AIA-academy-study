package ex;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		// List<E> --> ArrayList<E>
		// List<E> : 저장순서를 가진다. 데이터의 중복 저장이 가능하다.
		// 순서 --> 일괄처리 가능(반복적인 동일한 작업을 빠르게 처리 가능)
		
		// ArrayList 인스턴스 생성 : Integer 타입의 객체만 저장
		// ArrayList<Integer> List = new ArrayList<>(); // 인스턴스 생성시에 자료형 생략 가능
		// List <Integer> list = new ArrayList<>(); // 다형성
		
		// ArrayList<Integer> list = new ArrayList<Integer>();
		
		LinkedList<Integer> list = new LinkedList();
		
		// List<E> 정의된 메서드 -->
		// add(E) : 인스턴스의 저장
		// remove(index) : 해당 index의 요소를 삭제
		// size() : List 요소의 개수를 반환
		// get(index) : 해당 index 위치의 요소 반환
		
		
		// 데이터의 저장 : 저장의 순서를 가지고 있다
		list.add(new Integer(10)); // list.add(30); 도 가능 -->Auto Boxing
		list.add(new Integer(20)); 
		list.add(new Integer(30));
		list.add(new Integer(0));
		
		// 데이터의 참조
		System.out.println("저장된 데이터를 확인합니다.");
		
		// 반복문을 통해서 일괄 참조 가능
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------------------");
		
		// 데이터의 삭제
		// list.remove(1);
		System.out.println("데이터 삭제 후 데이터를 확인합니다.");
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		System.out.println("Iterator를 이용한 모든 요소 출력");
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
		
		
		
	}

}
