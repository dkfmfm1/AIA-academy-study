package ex;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		
		String phoneNumber = "Tel 82-02-997-2059";
		
		StringTokenizer st1 = new StringTokenizer(phoneNumber);
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken() ); // 공백 구분해서 반환
		}
		System.out.println("-----------------------------------------");
		
		
		System.out.println(phoneNumber); // 원본
		
		System.out.println("-----------------------------------------");
		
		StringTokenizer st2 = new StringTokenizer(phoneNumber, " -", true);
		
		while(st2.hasMoreTokens()) {
		System.out.println(st2.nextToken());
		}
	}

}
