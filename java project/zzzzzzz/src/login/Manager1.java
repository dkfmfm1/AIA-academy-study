package login;

import java.util.Scanner;

public class Manager1 {
 
	Main main = new Main(); 
	
	// 관리자 객체
	Infor[] member1;
	int cnt;
	Scanner sc;

	public Manager1() {
		member1 = new Infor[100000];
		cnt = 0;
		sc = new Scanner(System.in);
	}

	void addInfo1(Infor info) {
		member1[cnt] = info;
		cnt++;
	}

	void addInfo1() {
		member1[cnt] = signUpInstance1();
		cnt++;
	}

	Infor signUpInstance1() {

		Infor info = null;

		while (true) {

			System.out.println("*** 회원가입 페이지입니다***");

			System.out.println("이름을 입력해주세요.");
			String name = sc.nextLine();

			System.out.println("이메일을 입력해 주세요.");
			String email = sc.nextLine();

			System.out.println("아이디를 입력해 주세요.");
			String id = sc.nextLine();

			System.out.println("비밀번호를 입력해 주세요.");
			String password = sc.nextLine();

			if ((name == null || name.trim().isEmpty()) || (email == null || email.trim().isEmpty())
					|| (id == null || id.trim().isEmpty()) || (password == null || password.trim().isEmpty())) {
				System.out.println("입력되지 않은 항목이 있습니다. 모든 항목을 빠짐없이 입력해주세요.");
				continue; // 회원가입페이지입니다. 부터 다시나오게 하는 방법을 모르겠어요.
			}

			System.out.println("회원가입이 완료되었습니다.");

			info = new Infor(name, email, id, password);

			return info;
		}
	}

	void loginInfo() {

		for (int i = 0; i < member1.length; i++) {

			System.out.println("===========================");
			System.out.println("*** 로그인 페이지입니다 ***");
			System.out.println("아이디를 입력해주세요.");
			// 회원가입에 저장된 데이터랑, 로그인할 때 사용자한테서 입력받는 데이터를 비교하는 방법을 모르겠어요
			String id = sc.nextLine();

			System.out.println("비밀번호를 입력해주세요.");
			// 회원가입에 저장된 데이터랑, 로그인할 때 사용자한테서 입력받는 데이터를 비교하는 방법을 모르겠어요
			String password = sc.nextLine();

			if (member1[i] == null) {
				System.out.println("가입된 정보가 없습니다.");
				main.main(null);
			} else if (member1[i].id.equals(id) && member1[i].password.equals(password)) {
				System.out.println("로그인 되었습니다.");
				break;
			} else {
				System.out.println("가입된 정보가 없습니다.");
				continue;
			}
		}
	}
	
	void stockInfo() {

		System.out.println("*** 고양이 물품 재고입니다 ***");
		System.out.println("야옹아놀자 사료(대)         | 재고 : 26");
		System.out.println("야옹아놀자 사료(소)         | 재고 : 54");
		System.out.println("애옹애옹 츄르               | 재고 : 33");
		System.out.println("떼껄룩 츄르                 | 재고 : 47");
		System.out.println("---------------------------------------");
		System.out.println("야옹야옹 낚시 장난감        | 재고 : 17");
		System.out.println("미야옹 스크래쳐             | 재고 : 14");
		System.out.println("고양이가 좋아 고양이 샴푸   | 재고 : 27");
		System.out.println("고양이가 좋아 고양이 샤워기 | 재고 : 16");
		System.out.println("");
		System.out.println("");
		System.out.println("*** 강아지 물품 재고입니다 ***");
		System.out.println("멍멍이가 왈왈 사료(대)      | 재고 : 23");
		System.out.println("멍멍이가 왈왈 사료(소)      | 재고 : 37");
		System.out.println("컹컹컹 개껌 / 재고 : 48");
		System.out.println("왈왈왈 육포 / 재고 : 29");
		System.out.println("---------------------------------------");
		System.out.println("강아지아지 공               | 재고 : 24");
		System.out.println("강아지아지 원반             | 재고 : 26");
		System.out.println("강아지 빌리지 강아지 샴푸   | 재고 : 19");
		System.out.println("강아지 빌리지 강아지 샤워기 | 재고 : 34");
		System.out.println("");
		System.out.println("");

	}

}