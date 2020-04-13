package ex1;

public class Boolean {

	public static void main(String[] args) {
	
		boolean b1 = true;
		boolean b2 = false;
		
		int num = 100;
		
		
		System.out.println(b1); // b1 값은  true
		System.out.println(b2); // b2 값은 false
		System.out.println("--------------------------------------");
		System.out.println(4>3); // 4는 3보다 크니까 true ---- 비교연산자들 >, <, ==, >=, <=
		System.out.println(4<3); // 4는 3보다 크니까 false
		System.out.println("--------------------------------------");
		System.out.println(num<3); // num값은 100이므로 100보다 3이 작으므로 false
		System.out.println(num>20); // 100보다 20이 작아서  true
		
	}

}
