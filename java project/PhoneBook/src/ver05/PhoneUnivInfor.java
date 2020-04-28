package ver05;

// PhoneInfor 클래스를 상속해서 새로운 클래스를 정의
public class PhoneUnivInfor extends PhoneInfor{

	String major;	// 친구의 전공
	String grade;	// 친구의 학년
	
	public PhoneUnivInfor(String name, String phoneNumber, String addr, String email, String major, String grade) {
		super(name, phoneNumber, addr, email);
		this.major = major;
		this.grade = grade;
	}

	@Override
	void showAllInfor() {
		super.showAllInfor();
		System.out.println("전공 : " +major);
		System.out.println("학년 : " +grade);
	}

	
	
}
