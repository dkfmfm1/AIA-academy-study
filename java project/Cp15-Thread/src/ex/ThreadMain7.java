package ex;

public class ThreadMain7 {

	public static void main(String[] args) {
		
		Calcurator cal = new Calcurator();
		
		CalAddThread cat = new CalAddThread(cal);
		CallMinThread cmt = new CallMinThread(cal);
				
		cat.start();
		cmt.start();
		
		try {
			cat.join();
			cmt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		cal.showOpCnt();
		
		
	}

}
