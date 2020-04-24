package scm;

public class Tv extends Product {
	
	Tv(int price){
		super(price);
	}
	
	// toString 오버라이딩
	public String toString() {
		return "Tv";
	}
	
	
	void display() {
		System.out.println("Tv를 봅니다.");
	}
	
}
