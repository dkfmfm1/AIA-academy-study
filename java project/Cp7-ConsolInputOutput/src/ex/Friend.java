package ex;

public class Friend {

	String myName;
	
	Friend(String name){
		myName = name;
	}
	
	// Object 클래스의 toString() 메서드를 재구성한다 --> 오버라이딩(조상이 물려준 메서드만 오버라이딩 가능)
	// 메서드의 선언부가 원본 메서드의 선언부와 동일해야한다
	public String toString() {
		return "제 이름은 " + this.myName + " 입니다.";
	}
	
	
//	@Override  // shift + alt + s
//	public String toString() {
//		return "Friend [myName=" + myName + "]";
//	}
	
	
	
	public static void main(String[] args) {
		
		Friend f1 = new Friend("Messi");
		Friend f2 = new Friend("Neymar");
		Friend f3 = new Friend("Suarez");
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		
		System.out.println("");
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		
	}

	
}
