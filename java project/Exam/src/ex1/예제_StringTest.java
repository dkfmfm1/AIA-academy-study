package ex1;

public class 예제_StringTest {
	public static void main(String[] args) {
		double aa = 1D; // 밑줄 그어진거 변수 선언해놓고 안쓰니까 저장공간 낭비라고 뜨는것
		String a = 7 + " "; // String타입 변수 a에 숫자 7, 공백 저장 -->7+" "는 정수로 출력
		String b = " " + 7; // String타입 변수 b에 공백, 숫자 7 저장 --> " 7" 문자로 출력
		String c = 7 + ""; // String타입 변수 c에 숫자 7, 문자열 저장 --> 7+""는 정수로 출력
		String d = "" + 7; // String타입 변수 d에 문자열, 숫자 7 저장 --> "7" 문자로 출력
		String e = "" + ""; // ""안이 아무것도 없음, 아무것도 출력안됨
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
