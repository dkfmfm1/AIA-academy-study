package ex1;

public class 예제_CastingEx2{
	public static void main(String[] args){
		byte b = 10;
		int i = (int)b; // byte를 int로 형변환
		System.out.println("i=" + i); // 문자열 i= 출력, 변수 i 값인 10 출력
		System.out.println("b=" + b);
		int i2 = 300;
		byte b2 = (byte)i2; // int를 byte로 형변환
		System.out.println("i2=" + i2);
		System.out.println("b2=" + b2); // byte의 범위는 -128~127이므로 300은 그 범위를 초과하게 된다.
	}
}