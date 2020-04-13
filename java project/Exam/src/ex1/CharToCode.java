package ex1;

public class CharToCode {
	 public static void main(String[] args) {
		 char ch = 'A'; //char타입 변수 ch에 값 A 저장(문자)
		 // char ch = '\u0041';로 바꿔 써도 같다.
		 int code = (int)ch; // int타입 변수 code에 ch값을 int형으로 변환하여 저장한다.
		 
		 System.out.println(ch); // ch값인 문자 A 출력
		 System.out.println(code); // 문자 A값이 int로 변환되어 출력
	}
}

