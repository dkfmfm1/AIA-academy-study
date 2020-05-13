package login;

import java.util.Scanner;

public class Manager {
 
	Main main = new Main();
	
	// 회원 객체
	Infor[] member;
	int cnt;
	Scanner sc;

	public Manager() {
		member = new Infor[100000];
		cnt = 0;
		sc = new Scanner(System.in);
	}

	void addInfo(Infor info) {
		member[cnt] = info;
		cnt++;
	}

	void addInfo() {
		member[cnt] = signUpInstance();
		cnt++;
	}

	Infor signUpInstance() {

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

		for (int i = 0; i < member.length; i++) {
		
		System.out.println("===========================");
		System.out.println("*** 로그인 페이지입니다 ***");
		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();

		System.out.println("비밀번호를 입력해주세요.");
		String password = sc.nextLine();

		

		if (member[i] == null) {
			System.out.println("가입된 정보가 없습니다.");
			main.main(null);
		} else if (member[i].id.equals(id) && member[i].password.equals(password)) {
			System.out.println("로그인 되었습니다.");
			break;
		} else {
			System.out.println("가입된 정보가 없습니다.");
			continue;
		}
		}
	}

	void showAllData() {

		for (int i = 0; i < cnt; i++) {
			member[i].showInfor();
			System.out.println("------------");
		}

	}
	
	
	int searchIndex(String name) {

		int searchIndex = -1;

		for (int i = 0; i < cnt; i++) {
			if (member[i].checkName(name)) {
				searchIndex = i;
				break;
			}
		}

		return searchIndex;

	}

	void searchInfo() {

		System.out.println("검색하고자하는 아이디를 입력해주세요");
		String id = sc.nextLine();

		int searchIndex = searchIndex(id);

		if (searchIndex < 0) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			member[searchIndex].showInfor();
		}

	}

	void deleteInfo() {

		System.out.println("삭제하고자하는 아이디를 입력해주세요");
		String id = sc.nextLine();

		int searchIndex = searchIndex(id);

		if (searchIndex < 0) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {

			for (int i = searchIndex; i < cnt - 1; i++) {
				member[i] = member[i + 1];
			}

			cnt--;

			System.out.println("요청하신 아이디를 삭제했습니다.");

		}

	}
	
	void productList() {
		System.out.println("*** 상품목록입니다 ***");
		System.out.println("");
		System.out.println("--강아지--");
		System.out.println("중형견 사료   | 가격 : 35200");
		System.out.println("대형견 사료   | 가격 : 51000");
		System.out.println("강아지껌      | 가격 : 9800");
		System.out.println("강아지 육포   | 가격 : 12100");
		System.out.println("애견 털브러쉬 | 가격 : 15900");
		System.out.println("애견 목욕장갑 | 가격 : 5300");
		System.out.println("");
		System.out.println("--고양이--");
		System.out.println("소형묘 사료   | 가격 : 26900");
		System.out.println("중형묘 사료   | 가격 : 34450");
		System.out.println("참치볼        | 가격 : 11500");
		System.out.println("연어볼        | 가격 : 13200");
		System.out.println("");
		System.out.println("");
	}
	
}