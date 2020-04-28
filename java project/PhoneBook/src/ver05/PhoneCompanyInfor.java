package ver05;

public class PhoneCompanyInfor extends PhoneInfor {

	String company;		// 회사이름
	String dept;		// 부서
	String job;			// 직급
	
	public PhoneCompanyInfor(String name, String phoneNumber, String addr, String email, String company, String dept, String job) {
		super(name, phoneNumber, addr, email);
		this.company = company;
		this.dept = dept;
		this.job = job;
		
	}

	@Override
	void showAllInfor() {
		super.showAllInfor();
		System.out.println("회사이름 : " +company);
		System.out.println("부서 : " +dept);
		System.out.println("직급 : " +job);
	}
	
	
	

}
