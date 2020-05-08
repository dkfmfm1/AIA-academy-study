package ver02;

import java.util.Scanner;

public class Manager {

	Infor createInstance() {
		Infor info = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용자 입력을 시작합니다.");
		System.out.println("(필수)이름을 입력해주세요.");
		String name = sc.nextLine();
		
		System.out.println("(필수)이메일을 입력해주세요.");
		String email = sc.nextLine();
		
		System.out.println("(선택)전화번호를 입력해주세요.");
		
		String pNum = sc.nextLine();  // pNum값 받음
		
		int phoneNumber = 0; // 폰넘버 0으로 초기화(밑에 조건에 걸리는게 없으면 0으로 출력됨
		
		if(pNum!=null && !pNum.trim().isEmpty()) { // 값이 뭐라도 들어갔다면
			
			phoneNumber = Integer.parseInt(pNum);  // 폰넘버에 pNum값 넣어줌(스트링을 int로 변환해서)
			
		}
						
		System.out.println("(필수)아이디를 입력해주세요.");
		String id = sc.nextLine();
		
		System.out.println("(필수)비밀번호를 입력해주세요.");
		String password = sc.nextLine();
		
		System.out.println(phoneNumber);
		
		
		if(email==null||email.trim().isEmpty()) {
			info = new Infor(name, phoneNumber, id, password);
		}else if(phoneNumber==0) {
			info = new Infor(name, email, id, password);
		}else {
			info = new Infor(name, email, phoneNumber, id, password);
		}
		
		return info;
		
	}
	
}
