package card;

public class CardMain2 {

	public static void main(String[] args) {
		
		Card c3 = new Card();
		c3.kind = "Clover";
		c3.number = 3;
		
		Card c4 = new Card();
		c4.kind = "Diamond";
		
		System.out.println("세번째 카드는 "+ c3.kind +" " + c3.number + "이고, 카드의 높이는" + c3.height + "이고, 폭은 " + c3.width + "입니다");
		System.out.println("세번째 카드는 "+ c4.kind +" " + c4.number + "이고, 카드의 높이는" + c4.height + "이고, 폭은 " + c4.width + "입니다");

		Card.height = 200;
		Card.width = 75;
		
		System.out.println("세번째 카드는 "+ c3.kind +" " + c3.number + "이고, 카드의 높이는" + c3.height + "이고, 폭은 " + c3.width + "입니다");
		System.out.println("세번째 카드는 "+ c4.kind +" " + c4.number + "이고, 카드의 높이는" + c4.height + "이고, 폭은 " + c4.width + "입니다");
		
	}

}
