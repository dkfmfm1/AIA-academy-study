package ver02;

	public class Infor {
	
		String name;
		String email;
		int phoneNumber;
		String id;
		String password;
	
		
	public Infor(String name, String email, int phoneNumber, String id, String password) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.password = password;
	}	
	
	
	public Infor(String name, String email, String id, String password) {
		this(name, email, 0, id, password);
	}
	
	public Infor(String name, int phoneNumber, String id, String password) {
		this(name, "입력값이 없습니다.", phoneNumber, id, password);
	}
	
	
	
	void showInfor () {
		System.out.println("이름 : " +this.name);
		System.out.println("이메일 : " +this.email);
		System.out.println("전화번호 : " +this.phoneNumber);
		System.out.println("아이디 : " +this.id);
		System.out.println("비밀번호 : " +this.password);
	}
	
}
	
	
