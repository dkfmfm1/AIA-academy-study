package ex1;

public class 예제_CastingEx2{
	public static void main(String[] args){
		byte b = 10; //byte타입 변수 b에  값을 10으로 선언
		int i = (int)b; // int타입 변수 i에 byte타입 변수 b를 int타입으로 형변환하여 값으로 선언
		System.out.println("i=" + i); // 문자열 i= 출력, 변수 i 값인 10 출력
		System.out.println("b=" + b); // 문자열 b= 출력, 변수 b 값인 10 출력
		int i2 = 300; // int타입 변수 i2에 값을 300으로 선언
		byte b2 = (byte)i2; // byte타입 변수 b2에 int타입 변수 i2를 byte타입으로 형변환하여 값으로 선언
		System.out.println("i2=" + i2); // 문자열 i2가 출력되고 i2값인 정수 300 출력
		System.out.println("b2=" + b2); // 문자열 b2가 출력되고 b2값으로 정수 300을 byte타입으로 변환한 값이 출력
	}
}