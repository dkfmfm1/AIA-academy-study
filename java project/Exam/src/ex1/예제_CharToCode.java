package ex1;

public class 예제_CharToCode {
	 public static void main(String[] args) {
		 char ch = 'A'; // char ch = '\u0041';로 바꿔 써도 같다.
		 int code = (int)ch; // ch에 저장된 값을 int형으로 변환하여 저장한다.
		 
		 System.out.println(ch);
		 System.out.println(code);
	}
}

//class 예제_CodeToChar {
//	 public static void main(String[] args) {
//		 int code = 65; // 또는 int code = 0x0041;
//		 char ch = (char)code; // 명시적 형변환
//		 System.out.println(code);
//		 System.out.println(ch);
//	 }
//} 