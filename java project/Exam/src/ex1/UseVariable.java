package ex1;

class 예제_UseVariable {
	public static void main(String[] args) {
		// 1. 정수형 타입의 변수 num1변수를 선언하자
		// 2. 변수 num1에 숫자 데이터 10을 저장하자.
		// 3. 정수형 타입의 변수 num2변수를 선언하고 숫자 20을 대입하자.
		// 4. 정수형 타입의 변수 num3을 선언하고, 변수 num1과 num2를 합하는 연산한 결과를 변수 num3에 대입한다.
		// 5. 연산의 결과를 출력하자.
		int num1; //int타입 변수 num1 선언
		num1 = 10; // 변수 선언 후 처음 데이터를 저장하는 것 --> 초기화
		int num2 = 20; // 변수 선언과 초기화가 한번에 정의됨
		int num3 = num1 + num2; // int타입 변수 num3에 num1값 10과 num2값 20을 더한 값 저장
		System.out.println(num3);
	}
}