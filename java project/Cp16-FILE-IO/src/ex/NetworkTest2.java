package ex;

import java.net.URL;
import java.net.URLConnection;

public class NetworkTest2 {

	public static void main(String[] args) {
		
		URL ur1 = null;
		
		String address = "https://www.google.com/search?q=%EC%A7%91%EC%97%90+%EA%B0%80%EA%B3%A0%EC%8B%B6%EB%8B%A4&oq=%EC%A7%91%EC%97%90+%EA%B0%80%EA%B3%A0%EC%8B%B6%EB%8B%A4&aqs=chrome..69i57j0l7.2360j0j7&sourceid=chrome&ie=UTF-8";
	
		ur1 = new URL(address);
		URLConnection conn = url.openConnection();
		
		
				
	}

}
