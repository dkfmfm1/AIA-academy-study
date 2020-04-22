package ver01;

public class PhonebookMain {

	public static void main(String[] args) {
		
		PhoneInfor info = new PhoneInfor("messi", "010-1234-5678", "1987.06.24");
		
		info.showInfo();
		
		System.out.println("-------------------------------");
		
		info = new PhoneInfor("neymar", "010-1111-1111");
		info.showInfo();

	}

}
