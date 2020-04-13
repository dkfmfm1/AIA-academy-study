package ex;

public class SwitchCase {

	public static void main(String[] args) {
		
		int menuNum = 1;
		
		switch(menuNum) {
		
		case 1:
			System.out.println("1. Simple JAVA");
		case 2:
			System.out.println("2. Funny JAVA");
		case 3:
			System.out.println("3. Fantastic JAVA");
		default: //맞고 틀리고를 떠나서 무조건 실행(생략가능)
			System.out.println("d. The Best Programming Languege");
		
		}

		System.out.println("Do you like coffee?");
		
		
	}

}
