package ex;

public class SwitchCaseBreak {

	public static void main(String[] args) {
		
		int menuNum = 1;
		
		switch(menuNum) {
		
		case 1:
			System.out.println("1. Simple JAVA");
			break;// 밑에것을 다 종료함 --> menuNum값이 1일 경우 case1이랑 do you like coffee만 실행
		case 2:
			System.out.println("2. Funny JAVA");
			break;
		case 3:
			System.out.println("3. Fantastic JAVA");
			break;
		default: //맞고 틀리고를 떠나서 무조건 실행(생략가능)
			System.out.println("d. The Best Programming Languege");
		
		}

		System.out.println("Do you like coffee?");
		
		
	}

}
