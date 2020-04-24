package scm;

public class ScmMain {

	public static void main(String[] args) {
		
		// 상속관계에서 다형성
		// 상위클래스타입의 참조변수에 하위클래스의 인스턴스를 참조(상위클래스타입 참조변수 = 하위클래스 인스턴스)
		Product p = new Tv(100);
		
		// System.out.println(p1);
		
		Tv tv = new Tv(10);
		Computer com = new Computer(20);
		Audio aud = new Audio(30);

		int sum = tv.price+com.price+aud.price;
		
		Product p1 = (Product)tv; // 명시적형변환? (얘 안해도 밑에처럼 자동형변환됨)
		Product p2 = com; //자동으로 형변환 해줌
		Product p3 = aud;
		
		// 상위 클래스 타입의 배열 생성
		Product[] products = new Product[3];
		products[0] = new Tv(100);
		products[1] = new Computer(200);
		products[2] = new Audio(300);
		
		// products[0].display();
		// 명시적인 형변환을 해야 밑에 코드 쓸 수 있음 -- 상위타입의 변수에서 하위타입의 변수로 바꿔줄 때 명시적 형변환해줌
		// instanceof 연산자 : ex) p1 instanceof Computer ==> true/false
		// --> 참조변수가 참조하는 인스턴스를 특정 클래스 타입으로 형변환 가능한지 여부를 확인
		
		
		
		// 전달하는 배열에 컴퓨터가 있다면 프로그래밍을 하겠다.
		for(int i=0; i<products.length; i++) {
			
			if(products[i] instanceof Computer) {
				((Computer)products[i]).programming();
			}
		}
		
		System.out.println("================================================");
		System.out.println("================================================");
		
		
		int sumOfPrice = 0;
		int sumOfPoint = 0;
		
//		for(int i=0; i<products.length; i++) {
//			System.out.println(products[i]);
//			sumOfPrice += products[i].price;
//			sumOfPoint += products[i].bonusPoint;
//		}
		
//		System.out.println("전체 제품의 가격의 합은 : " + sumOfPrice);
//		System.out.println("전체 제품의 포인트의 합은 : " + sumOfPoint);
		
		
		
		// 구매자가 제품을 구매하는 시뮬레이션
		// 구매자 생성
		Buyer buyer = new Buyer();
		
		// 제품 생성
		Tv product1 = new Tv(200);
		Computer product2 = new Computer(250);
		Audio product3 = new Audio(100);
		
		// Tv 구매
		buyer.buy(product1);
		// Computer 구매
		buyer.buy(product2);
		// Audio 구매
		buyer.buy(product3);
		// Computer 구매
		buyer.buy(product2);
		
		//System.out.println("현재 보유금액 : " + buyer.money);
		//System.out.println("현재 보유포인트 : " + buyer.bonusPoint);
		
		buyer.summary();
		
		
		
		
		
		
	}

}
