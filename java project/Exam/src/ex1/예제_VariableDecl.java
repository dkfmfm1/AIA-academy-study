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

public class 예제_VariableDecl {
	public static void main(String[] args) {
		double num1, num2, result;
		
		num1 = 1.0000001;
		num2 = 2.0000001;
		result = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(result);
		
		double num3, num4, result1; 
		
		num3 = num1*10000000;
		num4 = num2*10000000;
		result1 = num3 + num4;

		System.out.println(num3);
		System.out.println(num4);
		System.out.println(result1/10000000);
	}
}