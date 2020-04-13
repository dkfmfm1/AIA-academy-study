package ex1;

public class SpecialChar {
	public static void main(String[] args) {
		char single = '\''; // char타입 변수 single에 '저장
		// single = ''';와 같이 할 수 없다.
		String dblQuote = "\"Hello\""; // String타입 변수 db1Quote에 문자열 "Hello" 저장
		 // 겹따옴표를 출력하려면 이렇게 한다.
		String root = "c:\\"; // String타입 변수 root에 문자열 c:\ 저장
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
	}
}