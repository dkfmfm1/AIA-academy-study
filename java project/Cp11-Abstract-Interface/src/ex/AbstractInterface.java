package ex;

public class AbstractInterface {

	public static void main(String[] args) {
		
		//PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);  ---> 추상클래스
		
		PersonalNumber storage = new PersonalNumberStorageImpl(100); // PersonalNumber --> 상위클래스 / 인터페이스도 다형성 처리가 된다.
		
		storage.addPersonalInfo("202020-1111111", "손흥민");
		storage.addPersonalInfo("202020-1000000", "박지성");
		
		System.out.println(storage.searchName("202020-1111111"));
		System.out.println(storage.searchName("202020-1000000"));
	}

}
