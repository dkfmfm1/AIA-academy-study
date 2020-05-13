package login;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {

		Manager manager = new Manager();
		Manager1 manager1 = new Manager1();
		Client client = new Client();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {

			Menu.showMenu1();
			int selectNum = sc.nextInt();
			sc.nextLine();

			if (selectNum == 1) { // 관리자

				Menu.showMenu2_1();
				int selectNum1 = sc.nextInt();
				sc.nextLine();
				if (selectNum1 == 1) {

					manager1.loginInfo();// 로그인
					while(true) {
					
						Menu.showMenu4();
						int selectNum2 = sc.nextInt();
						sc.nextLine();
						switch (selectNum2) {
						case 1:
							// 전체 리스트 출력
							manager.showAllData();
							break;
						case 2:
							// 재고내역
							manager1.stockInfo();
							break;
						case 3:
							// 거래처 정보

							Menu.showMenu5();
							int selectNum5 = sc.nextInt();
							sc.nextLine();
							switch (selectNum5) {
							case 1:
								client.catClient();
								break;
							case 2:
								client.dogClient();
								break;
							}
							continue;
						case 4:
							System.exit(0);
							break;
						}
				
					}
				} else {
					manager1.addInfo1();// 회원가입
				}

			} else { // 사용자
				Menu.showMenu2_2();
				int selectNum3 = sc.nextInt();
				sc.nextLine();
				if (selectNum3 == 1) {
					manager.loginInfo();// 로그인
					while(true) {
					Menu.showMenu3();

					int selectNum4 = sc.nextInt();
					sc.nextLine();
					switch (selectNum4) {

					case 1:
						// 이름으로 검색
						manager.searchInfo();
						break;
					case 2:
						// 이름으로 검색후 삭제
						manager.deleteInfo();
						break;
					case 3:
						// 상품목록보기
						manager.productList();
						break;
					case 4:
						// return;
						System.out.println("EverPets를 이용해주셔서 감사합니다. 안녕히가세요.");
						System.exit(0);
						break;
					}
					continue;
					}
				} else {

					manager.addInfo(); // 회원가입

				}

			}

		}

	}

}