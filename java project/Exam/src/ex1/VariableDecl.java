package ex1;

//public class 예제2 {
//	public static void main(String[] args) {
//		double num1 = 1.0000001;
//		double num2 = 2.0000001;
//		double result = num1 + num2;
//		System.out.println(result);
//		double num3 = num1 * 10000000;
//		double num4 = num2 * 10000000;
//		double result1 = num3 + num4;
//		System.out.println(result1/10000000);
//	}
//}

public class VariableDecl {
	public static void main(String[] args) {
		double num1, num2, result; //double 타입 변수 num1, num2, result 선언
		
		num1 = 1.0000001; // 변수num1에 1.00001값 저장 
		num2 = 2.0000001; // 변수num2에 2.00001값 저장
		result = num1 + num2; // 변수result에 값 num1값과 num2값 더한 값 저장
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(result);
		
		double num3, num4, result1; 
		
		num3 = num1*10000000; // 실수를 정수로 계산한다.
		num4 = num2*10000000; // 실수를 정수로 계산한다.
		result1 = num3 + num4; 

		System.out.println(num3);
		System.out.println(num4);
		System.out.println(result1/10000000);
	}
}