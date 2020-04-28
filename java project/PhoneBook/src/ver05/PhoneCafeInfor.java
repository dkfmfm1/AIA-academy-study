package ver05;

public class PhoneCafeInfor extends PhoneInfor{

	String cafeName;	// 동호회 이름
	String nickName;	// 닉네임
	
	public PhoneCafeInfor(String name, String phoneNumber, String addr, String email, String cafeName, String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	@Override
	void showAllInfor() {
		super.showAllInfor();
		System.out.println("동호회이름 : " +cafeName);
		System.out.println("닉네임 : " +nickName);
	}

	
	
	
}
