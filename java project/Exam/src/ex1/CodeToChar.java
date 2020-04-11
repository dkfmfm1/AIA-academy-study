package ex1;

public class 예제_CodeToChar {
	 public static void main(String[] args) {
		 int code = 65; // int타입 변수 code에 값 65저장 
		 // 또는 int code = 0x0041;
		 char ch = (char)code; // char타입의 변수 ch에 int타입의 변수 code를 char타입으로 명시적 형변환하여 저장
		 
		 System.out.println(code); // int타입 변수code값이 출력
		 System.out.println(ch); // 65가 char타입으로 변환된 값 출력
	 }
} 