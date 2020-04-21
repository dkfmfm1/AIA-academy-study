package membership;

public class MemberShipMain {

	public static void main(String[] args) {
	
		
		//회원정보 5개를 저장할 수 있는 배열을 생성
		Member[] members = new Member[5]; // Member 타입의 인스턴스의 참조값을 저장하는 메모리 공간
										  // Member m1, m2, m3, m4, m5
		members[0] = new Member("dkfmfm1", "박현정", "phj9516@gmail.com");// Member 타입의 인스턴스 주소 저장
		members[1] = new Member("dkfmfm2", "바켠정", "phj9510@naver.com");
		members[2] = new Member("dkfmfm3", "현정박", "dkfmfm1@daum.com");
		members[3] = new Member("dkfmfm4", "켠정박", "dkfmfm@daum.com");
		members[4] = new Member("dkfmfm5", "정현박", "phjphj@naver.com");
		
		
		
		
		
//		members[0].showInfo();
//		members[1].showInfo();
//		members[2].showInfo();
//		members[3].showInfo();
//		members[4].showInfo();
		
		for (int i=0; i<members.length; i++) {
			System.out.println(members[i]);
		}
		
		System.out.println("============================");
		
		for (int i=0; i<members.length; i++) {
			members[i].showInfo();
			System.out.println("----------------------------");
		}
		
		
		
		
		Member member = new Member("dkfmfm1", "박현정", "phj9516@gmail.com");
		
		member.showInfo();
		
		System.out.println("---------------------------");
		
		System.out.println(member); // member.toString() 이 호출되는 것
		
		

	}

}
