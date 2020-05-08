package ver02;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Infor info = null;
		
		while(true) {
		info = manager.createInstance();
		info.showInfor();
		}
	}

}
