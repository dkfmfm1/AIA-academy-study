package fruit;



/*
작성자 : 박현정
수정일 : 2020.04.17
수정내용 : 생성자를 통한 변수 초기화, 현재 데이터 출력 메서드 생성(showResult())
*/
public class FruitSeller {

		
		// 속성 --> 변수로 표현
		// 사과의 개수
		// 수입
		// 사과의 가격
		// 맴버 변수, 인스턴스 변수
		
//		int numOfApple = 20; // 사과의 개수 (맴버 변수, 인스턴스 변수)
//		int myMoney = 0;	 // 수입
//		final int price = 1000;	 // 사과의 가격
		
		// 수정 :  변수의 명시적 초기화 변경
		int numOfApple; // 사과의 개수 (맴버 변수, 인스턴스 변수)
		int myMoney;	 // 수입
		final int APPLE_PRICE;	 // 사과의 가격
		
		
		
		// 생성자
		FruitSeller(){
//			numOfApple = 20;
//			myMoney = 0;
//			APPLE_PRICE = 1000;//디폴트
			
			this(20, 0, 1000);
		}
		
		FruitSeller(int price){
			this(20, 0, 1000);
		}
//		
//		FruitSeller(int numOfApple, int myMoney, int price) {
//			numOfApple = numOfApple;
//			myMoney = myMoney;
//			APPLE_PRICE = price;
//		}
//		
		
		//위의 코드나 이 코드나 같음
		public FruitSeller(int numOfApple, int myMoney, int aPPLE_PRICE) {//생성자 뒤에 매개변수 쓴것?
		super();
		this.numOfApple = numOfApple;//this는 나 자신을 가리키는 참조변수
		this.myMoney = myMoney;
		APPLE_PRICE = aPPLE_PRICE;
}
		
		
		// 판매 기능 : 메서드
		// 1. 돈을 받는다 --> 매개변수 int money
		// 2. 받은 돈의 사과의 개수를 구한다 
		// 3. 나의 사과 개수에서 반환해야하는 사과의 개수를 빼준다
		// 4. 받은 금액은 나의 수입으로 더해준다
		// 5. 사과의 개수를 반환한다 --> 반환 데이터 int return 사과의 개수
		int saleApple(int money) {
			int num = money/APPLE_PRICE;
			//numOfApple = numOfApple - num;
			numOfApple -= num;
			myMoney += money; // muMoney = Mymoney + money
			
			return num;
			
		}
		


		void showResult() {
			System.out.println("현재 보유금액 : " + myMoney+ "이고, 현재 보유한 사과의 개수는 " + numOfApple + "개 입니다");
		}
		
		
	}
	
