package ex1;

public class 예제_StringTest {
	public static void main(String[] args) {
		double aa = 1D; // 밑줄 그어진거 변수 선언해놓고 안쓰니까 저장공간 낭비라고 뜨는것
		String a = 7 + " "; // 정수 다음에 문자열이 나오니까 결과는 정수로 출력
		String b = " " + 7; // 문자열 다음 정수가 나오니까 결과는 문자열로 출력
		String c = 7 + ""; 
		String d = "" + 7;
		String e = "" + ""; 
		String f = 7 + 7 + ""; // 7+7=14, 14+""은 정수로 출력
		String g = "" + 7 + 7; // "" + 7 = "7", "7" + 7 = "7"+"7"
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	} 
}