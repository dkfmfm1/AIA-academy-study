package op;
   
public class LogicOp {
 
	public static void main(String[] args) {
		
		// 정수형 데이터 두개를 받는다.
		// int num1 = 10, num2 = 20;
		int num1 = 10; // 사용자에게 받는 첫번째 숫자
		int num2 = 20; // 사용자에게 받는 두번째 숫자
		//num1이 num2보다 큰지 확인
		// : 큰 경우 --> true
		// : 작은 경우 --> false
		boolean check1 = num1 > num2;		
		boolean check2 = num1 == num2;
		
		if(check2) {
			System.out.println("num1과 num2의 값이 같습니다");
		}else {
			System.out.println("num1과 num2의 값이 다릅니다");
		}
		
		if(check1) {
			System.out.println("num1의 값이 num2의 값보다 큽니다");
		}else {
			System.out.println("num1의 값이 num2의 값보다 작습니다.");
		}
		
		boolean result1 = (num1 == 10 && num2 == 20);   
		boolean result2 = (num1 <= 12 || num2 > 30);
		System.out.println(result1);
		System.out.println(result2);

		
		
		
		System.out.println("----------------------------------------------");
		// 1.성인 2.여성 중 3.기혼자에게만 메시지를 출력합니다.
		int age = 20;
		char gender = 'w';
		boolean mCheck = true;
		
		boolean result = age>19 && gender == 'w' && mCheck == true ;
		
		if(result) {
			System.out.println("메시지를 보냅니다.");
		}
		
	}

}
