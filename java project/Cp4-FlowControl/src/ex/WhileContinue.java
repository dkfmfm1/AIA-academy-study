package ex;

public class WhileContinue {

	public static void main(String[] args) {
		// 1~10 까지의 숫자 중 3의 배수를 제외하고 출력
		// 1~10 까지의 숫자 중 3의 배수만 출력
		
		for (int i=1; i<=10; i++) {
			
			if(i%3==0) { //3의 배수를 제외하고 출력 --> (!(i%3==0))는 3의 배수만 출력
				continue;
			}
		
			System.out.println(i);
		}
		

	}

}
