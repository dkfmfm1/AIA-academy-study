package scm;

public class Buyer {
   
   int money;       // 구매자의 보유 금액
   int bonusPoint; // 구매자의 보유 포인트
   
   Product[] item; // 구매시 담을 제품의 배열
   int numOfProduct; // 구매한 제품의 개수
   
   Buyer() { // 초기화하는 과정
      this.money = 1000;
      this.bonusPoint = 0;
      this.item = new Product[10];
      this.numOfProduct = 0; // 명시적으로 이 데이터는 0부터 시작되는 거라고 나타냄
      }
   
   
//    상속관계가 아닌 개별적인 클래스 -> 따로따로 -> 확장성 문제발생
//   void buy(Tv tv) {
//   
//   }
//   void buy(Computer com) {
//      
//   }
//   void buy(Audio aud) {
//      
//   }
   void buy(Product p) {
   
      // 구매 상품의 금액과 나의 보유 금액을 비교해서 구매여부를 처리한다.
      if(money < p.price) {
         System.out.println("잔액이 부족해서 구매 할 수 없습니다.");
         return;
      }
      
      // 구매처리 (돈 -,포인트 +)
      this.money -= p.price; // 보유한 금액에서 제품의 금액을 차감한다.
      this.bonusPoint += p.bonusPoint; // 보유한 포인트에 제품의 포인트를 추가한다.
      
      item[numOfProduct++] = p;
      //numOfProduct++;
      
      
      System.out.println(p+ "를 구매하셨습니다.");
      
   }
   
   // summary의 목적 = 구매내역 출력
   void summary() {
      
      int sum=0;      // 구매제품의 총액 (지역변수라 초기화->0부터 시작한다.)
      int points=0; // 구매제품의 포인트 총합
      
      String itemList = ""; // 구매제품의 이름 목록
      
      for(int i=0; i<numOfProduct; i++) {
         itemList += item[i]+", ";
         // itemList = itemList + (item[i]+", ");
         sum += item[i].price;
         points += item[i].bonusPoint;
      }
      
      System.out.println("구매목록 =====================");
      System.out.println("구매하신 제품은");
      System.out.println(itemList + "입니다.");
      System.out.println("구매하신 제품들의 총 금액은 " +sum+ "입니다.");
      System.out.println("구매하신 제품들의 적립 될 총 포인트는 " +bonusPoint+ "점 입니다.");
   }
   
   
   
   
   
}