package ex1;

public class 예제_ByteOverflow{
	public static void main(String[] args){
		
		byte b = 0; // byte형 변수 b를 선언하고 0으로 초기화.
		int i = 0; // int형 변수 i를 선언하고 0으로 초기화.
		// 반복문을 이용해서 b의 값을 1씩, 0부터 270까지 증가시킨다.
		
		for(int x=0; x <= 270; x++) { // x는 정수이며 0이 시작값, x의 값은 270 이하일 동안 1씩 증가한다.
			System.out.print(b++); // x조건을 만족하는 동안 b값은 1씩 증가한다.
			// print는 출력 후 줄 바꿈을 하지 않는다.
			System.out.print('\t'); // 줄바꿈
			System.out.println(i++); // x조건을 만족하는 동안 i값은 1씩 증가한다.
		}
	}
}