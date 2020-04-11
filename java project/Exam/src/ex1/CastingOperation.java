package ex1;

// 대문자 'A'의 유니코드값과 'Z'의 유니코드값을 출력하세요

public class 예제_CastingOperation {
	public static void main(String[] args) {
		char ch1='A'; // char타입 변수 ch1에 문자 A값 저장
		char ch2='Z'; // char타입 변수 ch2에 문자 Z값 저장
		
		int num1=ch1; // int타입 변수 num1에 변수ch1을 값으로 저장 --> char타입이 int타입으로 자동변환
		int num2=(int)ch2; // int타입 변수 num2에 변수ch2를 int로 명시적 형변환하여 저장
		
		System.out.println("문자 A의 유니코드 값: "+num1); // 문자열   문자 A의 유니코드 값   출력, num1값 출력(문자 A가 int타입으로 변환된 값 출력)
		System.out.println("문자 Z의 유니코드 값: "+num2); // 문자열   문자 Z의 유니코드 값   출력, num2값 출력(문자 Z가 int타입으로 변환된 값 출력)
	}
}
