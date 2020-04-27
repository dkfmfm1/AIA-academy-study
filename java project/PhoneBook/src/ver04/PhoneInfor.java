package ver04;

// 상속을 위한 기본 클래스 구성
// 인스턴스 생성의 목적이 없다
public class PhoneInfor {

	String name;			// 친구의 이름
	String phoneNumber;		// 친구의 전화번호
	String addr;			// 친구의 주소
	String email;			// 친구의 이메일
	
	
	// 생성자를 통해 인스턴스 변수 초기화
	PhoneInfor(String name, String phoneNumber, String addr, String email){
		
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.addr = addr;
	this.email = email;
	}
	
	// 기본정보 출력 메서드
	void showBasicInfor() {
		System.out.println("이름 : " +name);
		System.out.println("전화번호 : " +phoneNumber);
		System.out.println("주소 : " +addr);
		System.out.println("이메일 : " +email);
	}
	
	// 변수의 정보 출력
	void showAllInfor() {
		// 상속 후 오버라이딩을 통해 재구성
		showBasicInfor();
	}
	
}
