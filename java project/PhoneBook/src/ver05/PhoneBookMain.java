package ver05;

import java.util.InputMismatchException;

import ver05.exception.BadNumberException;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		//PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		while(true) {
			
			Menu.showMenu();
			
			int select = 0;
			
			try {
				select = manager.kb.nextInt();
				
				// 정상 범위는 1~6
				// MenuNum.INSERT ~ MenuNum.EXIT
				if(!(select >= MenuNum.INSERT && select <= MenuNum.EXIT)) {
					
					BadNumberException e = new BadNumberException("잘못된 메뉴입력");
							
					// 강제적인 예외 발생
					throw e;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 메뉴 입력입니다. \n확인하시고 다시 입력해주세요.");
				// manager.kb.nextLine(); // 얘 없으면 무한반복됨
				continue; // 밑으로 안내려가고 다시 위쪽부터 시작
			} catch (BadNumberException e)	{
				System.out.println("메뉴 범위를 벗어난 숫자 입력입니다. \n다시 확인 후 입력해주세요.");
				continue;
			} catch (Exception e) { // 이 catch 구문 없어도 됨
				System.out.println("잘못된 메뉴 입력입니다. \n확인하시고 다시 입력해주세요.");
				// manager.kb.nextLine(); 
				continue; 
			} finally { // finally{} 없이 밑에 주석처리한 manager.kb.nextLine(); 얘 써도 똑같음.
				manager.kb.nextLine();
			}
			
			// manager.kb.nextLine();
			
			
			switch(select) {
			case MenuNum.INSERT:
				manager.createInfo();
				break;
			case MenuNum.SEARCH:
				manager.showInfo();
				break;
			case MenuNum.DELETE:
				manager.deleteInfo();
				break;
			case MenuNum.EDIT:
				manager.editInfo();
				break;
			case MenuNum.PRINT_ALL:
				manager.showAllInfor();
				break;
			case MenuNum.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
		}

	}

}
