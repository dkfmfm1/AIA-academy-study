package ex;

public class Number {

	int num;
	
	// 생성자(아무것도 정의되지 않음) 
//	Number(){
//		System.out.println("생성자 호출");
//		num = 1000;
//	}
	
	Number(int n){
		
		System.out.println("생성자 호출");
		num = n;
		
	}
	
	public static void main(String[] args) {
		
		Number n1 = new Number(1000);
		
		System.out.println(n1.num);
		
		//new Number();
		
	}
	
}
