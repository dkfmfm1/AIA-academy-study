package ex1;

public class PrecisionTest{
	public static void main(String[] args){
		float f = 1.2345678901234567890f; // float타입 변수 f 선언 (값이 float의 범위를 넘어가서 접미사 f붙임)
		double d = 1.2345678901234567890; // double타입 변수 d 선언
		float f2 = 0.100000001f; // float 타입 변수 f2 선언
		double d2 = 0.100000001; // double타입 변수 d2 선언, 접미사 생략되었음
		double d3 = 0.1000000000000001; //double타입 변수 d3 선언
		System.out.println(f); // float타입은 소수점 7자리까지 표기하고 그 밑은 생략
		System.out.println(d); // double타입은 소수점 16자리까지 표기하고 그 밑은 생략
		System.out.println(f2); // 0생략하여 0.1로 출력
		System.out.println(d2); // 소수점 16자리까지 출력하므로 다 출력됨
		System.out.println(d3); // 소수점 16자리까지 출력하므로 다 출력됨
	}
}