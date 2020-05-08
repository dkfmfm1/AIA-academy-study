package ver01;

	public class Infor {
	
		String name;
		String email;
		String phoneNumber;
		String id;
		String password;
	
	Infor(String name, String email, String phoneNumber, String id, String password) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.password = password;
	}
	
	void showInfor () {
		System.out.println("이름 : " +this.name);
		System.out.println("이메일 : " +this.email);
		System.out.println("전화번호 : " +this.phoneNumber);
		System.out.println("아이디 : " +this.id);
		System.out.println("비밀번호 : " +this.password);
	}
	
}
