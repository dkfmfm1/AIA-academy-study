package ver03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Infor info = null;
		
		while(true) {
			
		Scanner sc = new Scanner(System.in);
			
		Menu.showMenu();
		int selectNum = sc.nextInt();
		sc.hasNextLine();
		
		switch(selectNum) {
		case 1:
			// PhoneInfor info = manager.createInstance();
			// manager.addInfo(info)
			manager.addInfo();
			break;
		case 2:
			// 정보를 배열에 저장
			manager.loginInfo();
			break;
		case 3:
			// 이름으로 검색 후 삭제
			manager.deleteInfo();
			break;
		case 4:
			// 전체 리스트 출력
			manager.showAllData();
			break;
		case 5:
			// return;
			System.out.println("프로그램이 종료되었습니다");
			System.exit(0); //프로세스 종료 가상머신
			
			break;
		}
		}
	}

}
