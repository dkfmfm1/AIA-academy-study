/*
PhoneBookManager 클래스의 인스턴스 수가 최대 하나를 넘지 않도록 코드를 변경.
‘interface’기반의 상수 표현을 바탕으로 메뉴 선택과 그에 따른 처리가, 이름에 부여된 상 수를 기반으로 진행되도록 변경.
PhoneInfor 클래스의 구조에서 “interface”를 추가하여 “추상 클래스”로 구성해봅시다
이 인터페이스에는 오버라이딩을 위한 메서드만 포한하는 인터페이스로 구성합니다
*/

package ver05;

import java.util.*;

import ver05.Info;
import ver05.exception.BadNumberException;
// 매니저는 기능 구현을 위한 클래스
// PhoneInfor 타입의 배열로 친구들의 정보를
// 저장, 수정, 삭제, 검색, 출력
public class PhoneBookManager {
	
	// 1. 배열 선언(생성된건 아님)
	PhoneInfo[] books; // 배열 인스턴스 초기화(null 값 들어가있음)
	// 배열에 저장된 요소의 개수
	int numOfInfo;
	
	Scanner kb;
	
	// 생성자를 통해서 배열 생성, 요소의 개수 초기화
	private PhoneBookManager(int num){
		// 배열의 생성
		books = new PhoneInfo[num];
		// 요소 개수의 초기화
		numOfInfo = 0;
		// Scanner 초기화
		kb = new Scanner(System.in);
	}
	
	private static PhoneBookManager manager = new PhoneBookManager(100);
	
	public static PhoneBookManager getInstance() {
		return manager;
	}
	
	// 2. 배열에 정보 저장
	// 2.1 배열에 추가
	void addInfo(PhoneInfo info) { // PhoneInfor타입의 참조값 저장
		// 배열에 numOfInfo 숫자 ==> index로 참조값을 저장
		books[numOfInfo] = info;
		// 입력된 정보의 개수를 +1 증가시킨다
		numOfInfo++;
	}
	
	// 2.2 사용자로부터 받은 데이터로 인스턴스 생성
	void createInfo() {
				
		// System.out.println(" 1. 일반 2. 대학 3. 회사 4. 동호회");
		
		
		// int select = kb.nextInt();
		// kb.nextLine();
		
		//사용자 선택 번호
		
		int select = 0;
		
		while(true) {
		
			System.out.println(" 1. 대학 2. 회사 3. 동호회");
			System.out.println("입력하고자 하는 번호를 입력해주세요");
			
			try {
				select = kb.nextInt();
				
				// 정상범위 1~3
				if(!(select >= 1 && select <= 3)) {
					
					BadNumberException e = new BadNumberException("잘못된 메뉴번호 입력입니다.");
					
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
			
			
		
			break;
		}
			
		
//		if(!(select>0 && select<5)) { // 들어오는 데이터가 1234를 벗어난다면
//			System.out.println("정상적인 메뉴 선택이 아닙니다.\n 메뉴를 다시 선택해주세요");
//			return;
//		}
		
		PhoneInfo info = null;
		
		String name = null, phoneNumber = null, addr = null, email = null;
		
		while(true) {
			
			
			// 2.2.1 기본정보 수집 : 이름, 전화번호, 주소, 이메일
			System.out.println("이름을 입력해주세요.");
			name = kb.nextLine();
			
			System.out.println("전화번호을 입력해주세요.");
			phoneNumber = kb.nextLine();
			
			System.out.println("주소를 입력해주세요.");
			addr = kb.nextLine();
			
			System.out.println("이메일을 입력해주세요.");
			email = kb.nextLine();
			
			
			try {
			
			if(
					name.trim().isEmpty()||
					phoneNumber.trim().isEmpty() ||
					addr.trim().isEmpty() ||
					email.trim().isEmpty()
					) {
				StringEmptyException e = new StringEmptyException();
				throw e;
			}
			} catch(StringEmptyException e) {
				System.out.println("기본 정보는 공백없이 모두 입력해주셔야 합니다.");
				System.out.println("다시 입력해주세요.\n");
				continue;
			}
			
			
			break; //while문 벗어나서 addInfo 처리
			
			
		}
			
			switch(select) {
	//		case 1:
	//			// 2.2.2 기본 클래스로 인스턴스 생성
	//			info = new PhoneInfo(name, phoneNumber, addr, email);
	//			break; 
			
			
			
			case MenuNum.UNIV:
				// 2.2.3 대학 클래스로 인스턴스 생성
				System.out.println("전공(학과)를 입력해주세요.");
				String major = kb.nextLine();
				System.out.println("학년 정보를 입력해주세요.");
				String grade = kb.nextLine();
				
				
				info = new PhoneUnivInfo(name, phoneNumber, addr, email, major, grade);
				break; 
			case MenuNum.COMPANY:
				// 2.2.4 회사 클래스로 인스턴스 생성
				System.out.println("회사의 이름을 입력해주세요.");
				String company = kb.nextLine();
				System.out.println("부서의 이름을 입력해주세요.");
				String dept = kb.nextLine();
				System.out.println("직급(직무)의 정보를 입력해주세요.");
				String job = kb.nextLine();
				
				info = new PhoneCompanyInfo(name, phoneNumber, addr, email, company, dept, job);
				break; 
			case MenuNum.CAFE:
				// 2.2.5 동호회 클래스로 인스턴스 생성
				System.out.println("동호회 이름을 입력해주세요.");
				String cafeName = kb.nextLine();
				System.out.println("닉네임을 입력해주세요.");
				String nickName = kb.nextLine();
				
				info = new PhoneCafeInfo(name, phoneNumber, addr, email, cafeName, nickName);
				break; 
			}
		
			
			
		
		
	// 2.3 생성된 인스턴스를 배열에 저장
	addInfo(info);
		

}
	
	
	// 3. 배열의 데이터 출력
		void showAllInfor() {
			
			// for each 반복문 : 현재 프로그램에서는 사용 불가
			// for 반복문 : 반복의 횟수 지정이 가능 numOfInfo
			
			System.out.println("전체 정보를 출력합니다========================");
			for(int i=0; i<numOfInfo; i++) {
				books[i].showAllInfo();
				System.out.println("---------------------------");
			}
			
		}
		
	// 배열의 index 검색 : 인스턴스의 name 기준
	int searchIndex(String name) {
		
		// 정상적인 index값은 0이상의 값, 찾지 못했을 때 구분 값 -1 사용
		int searchIndex = -1; 
		
		// 배열의 반복으로 name값을 비교해서 index값을 찾는다.
		for(int i=0; i<numOfInfo; i++) {
			if(books[i].name.equals(name)) {
				searchIndex = i;
				break;
			}
		}
		
		
		return searchIndex;
	}
		
	// 4. 배열의 정보 검색 : 이름 기준
	void showInfo() {
		
		System.out.println("검색하실 이름을 입력해주세요.");
		String name = kb.nextLine(); //지역변수는 실행되는 시점이 다 달라서 여러번 쓸 수 있음. name 같이
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("검색하신 이름의 정보가 없습니다.");
		} else {
			System.out.println("--------------------------------");
			books[index].showBasicInfo();
			System.out.println("--------------------------------");
		}
	}
	

	// 5. 배열의 정보를 삭제 : 이름 기준
	void deleteInfo() {
		System.out.println("삭제하고자 하는 이름을 입력해주세요.");
		String name = kb.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("삭제하고자하는 이름의 정보가 없습니다.");
		} else {
			
			// 삭제 위치에서 왼쪽으로 shift처리
			for(int i=index; i<numOfInfo-1; i++) {
				books[i] = books[i+1];
			}
			// 삭제가 되었으므로 요소의 개수도 -1
			numOfInfo--;
		}
	}
	

	// 6. 배열의 정보를 수정 : 이름 기준
	void editInfo() {
		System.out.println("변경하고자 하는 이름을 입력해주세요.");
		String name = kb.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
			return;
		} else {
			
			String editname = books[index].name;
			
			System.out.println("수정 데이터를 입력을 시작합니다.");
			System.out.println("이름은 " + editname + "입니다.");
			System.out.println("전화번호를 입력해주세요.");
			String phoneNumber = kb.nextLine();
			System.out.println("주소를 입력해주세요.");
			String addr = kb.nextLine();
			System.out.println("이메일을 입력해주세요.");
			String email = kb.nextLine();
			
			PhoneInfo info = null;
			
			// 저장된 인스턴스가   기본, 대학, 회사, 동호회  중 뭐인지에 따라 바뀜
			if(books[index] instanceof PhoneInfo) {
				System.out.println("전공을 입력해주세요.");
				String major = kb.nextLine();
				System.out.println("학년을 입력해주세요.");
				String grade = kb.nextLine();
				
				info = new PhoneUnivInfo(editname, phoneNumber, addr, email, major, grade);
				
			} else if (books[index] instanceof PhoneCompanyInfo) {
				System.out.println("회사 이름을 입력해주세요.");
				String company = kb.nextLine();
				System.out.println("부서 이름을 입력해주세요.");
				String dept = kb.nextLine();
				System.out.println("직무(직급)을 입력해주세요.");
				String job = kb.nextLine();
				
				info = new PhoneCompanyInfo(editname, phoneNumber, addr, email, company, dept, job);
				
			} else if (books[index] instanceof PhoneCafeInfo) {
				System.out.println("동호회 이름을 입력해주세요.");
				String cafeName = kb.nextLine();
				System.out.println("닉네임을 입력해주세요.");
				String nickName = kb.nextLine();
				
				info = new PhoneCafeInfo(editname, phoneNumber, addr, email, cafeName, nickName);
			}
//			else if (books[index] instanceof PhoneCafeInfo) {
//				info = new PhoneInfo(editname, phoneNumber, addr, email);
//			}
			
			// 배열에 새로운 인스턴스 저장
			books[index] = info; 
			
		}
	}
}