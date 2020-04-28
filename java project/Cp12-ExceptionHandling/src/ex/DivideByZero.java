package ex;

public class DivideByZero {

	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 0;
		
		
		try {
			
			// 예외 발생 지점
			int divide = num1/num2;
			System.out.println("연산의 결과는 : " + divide); // int divide = num1/num2; 이부분 예외발생 시 이거 실행 안하고 밑으로 내려감
															 // 예외 발생 안되면 이 코드 실행하고 밑에껀 실행 안됨
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage()); // 예외타입이 가지는 String 값을 반환
			e.printStackTrace(); // 예외 확인, java.lang.ArithmeticException: / by zero 컴파일 했을 시 이 부분
		
			return;
			
		}finally {
			System.out.println("무조건 실행하는 finally 블록"); // return을 만나도 finally는 실행
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
