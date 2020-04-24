package friend;

public class HighFriend extends Friend {

	String work;	//친구의 직업
	
	// alt shift s 생성자 from 수퍼클래스
	public HighFriend(String name, String phoneNum, String addr, String work) {
		super(name, phoneNum, addr);
		this.work = work;
	}

	@Override
	void showData() {
		showBasicInfo(); // Friend의 showBasicInfo 상속받음
		System.out.println("직업 : " + this.work); // 그냥 work라 해도 됨
	}

	
	
	
}
