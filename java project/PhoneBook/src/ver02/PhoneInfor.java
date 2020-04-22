package ver02;

import java.util.*;

/*Project : ver 0.20
"프로그램 사용자로부터 데이터 입력"
프로그램 사용자로부터 데이터를 입력 받아 클래스의 인스턴스를 생성하는 것이
핵심.
단 반복문을 이용해서 프로그램의 흐름을 계속 유지하도록 한다.
프로그램 종료를 하지 않으면, 다음과 같은 과정이 반복적으로 이루어짐.

키보드로부터 데이터 입력 
↓
입력 받은 데이터로 인스턴스 생성
↓
생성된 인스턴스의 메소드 호출*/



public class PhoneInfor {

	// private : 변수의 직접 참조를 막는다(정보은닉)
	private String name;   			// 친구의 이름
	private String phoneNumber; 	// 친구의 전화번호
	private String birthday;		// 친구의 생일

	// 초기화를 위한 생성자
	PhoneInfor(String name, String phoneNumber, String birthday){
		this.name = name; //지역변수 받아서 초기화함
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	PhoneInfor(String name, String phoneNumber){
		//this.name = name;
		//this.phoneNumber = phoneNumber;
		//this(name, phoneNumber, null);
		this(name, phoneNumber, "입력값이 없습니다");
	}
	

	void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("번화번호 : " + this.phoneNumber);
		System.out.println("생일 : " + this.birthday);
		
//		if(this.birthday == null) {
//			System.out.println("생일 : 입력값이 없습니다");
//		} else {
//			System.out.println("생일 : " + this.birthday);
//		}
		
	}

}
