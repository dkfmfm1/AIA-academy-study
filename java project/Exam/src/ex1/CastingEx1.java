package ex1;

public class 예제_CastingEx1{
	public static void main(String[] args){
		double d = 100.0;
		int i = 100;
		int result = i + (int)d;
		System.out.println("d=" + d); // 문자열 d= 출력, d변수의 값 100.0출력
		System.out.println("i=" + i); // 문자열 i= 출력, i변수의 값 100 출력
		System.out.println("result=" + result); // 문자열 result= 출력, (int)d ---> double 값이 int 값으로 형변환 되서 100, 100+100 = 200 출력
	}
}  