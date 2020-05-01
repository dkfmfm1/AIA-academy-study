package friend;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendInfoHandler {
	
	// 2020.04.28
	// 싱글톤처리
	//	1. manager 클래스의 싱글톤 패턴
	//
	//	  1) 생성자 접근제어지시자 : private
	//	     private 처리하는 목적 --> 인스턴스 생성을 막기위해
	//
	//	  2) 공동으로 사용할 인스턴스 생성 : static private
	//
	//	  3) 참조변수 반환 메서드 : static public
	
	// 2020.05.01
	// 배열에 저장 --> List 이용
	
	//
	//	2. interface기반의 상수 표현, 메뉴 표현
	//	3. interface -> 추상클래스 -> 상속 관계 구조로 변경
	
	private static FriendInfoHandler handler = new FriendInfoHandler(100);

	static FriendInfoHandler getInstance() {
		return handler;
	}
	

   // Friend 타입의 정보를 저장 할 배열을 가진다.
   // 친구정보를 저장하는 기능.
   // 친구정보의 기본정보 출력 기능.
   // 친구정보의 상세정보 출력 기능.
   
   
   // private Friend[] myFriends; // Friend 타입의 배열 선언
   
	// List 참조변수
	private ArrayList<Friend> myFriends;
		
	// private int numOfFriend;   // 저장된 친구의 정보개수
   
   Scanner kb;
   
   // 생성자 초기화 : 저장공간의 크기를 받아서 배열을 생성할 것이다.
   FriendInfoHandler(int num){
      // myFriends = new Friend[num];
      // this.numOfFriend = numOfFriend; // numOfFriend = 0; 이랑 같은듯?
	   // ArrayList 인스턴스 생성
	   myFriends = new ArrayList<Friend>();
	   kb = new Scanner(System.in);
   }
   
   // 친구정보를 저장하는 기능.
   // 1. 배열에 저장하는 기능
   // 2. 사용자에게 데이터를 받아서 사용자 요청에 맞는 인스턴스 생성해준다.
   
   // 1. 배열에 저장하는 기능
   void addFriendInfo(Friend f) {
      // 배열에 저장
      // myFriends[numOfFriend]=f;
      // numOfFriend++;
	   
	   // 리스트에 저장
	   myFriends.add(f);
   }
   
   // 2. 사용자에게 데이터를 받아서 사용자 요청에 맞는 인스턴스 생성해준다
   // HighFriend / UnivFriend
   void addFriend(int choice) {
      
      
      
      // 기본정보 받기
      System.out.println("이름을 입력 해 주세요.");
      String name = kb.nextLine();
      System.out.println("전화번호를 입력 해 주세요.");
      String phoneNum = kb.nextLine();
      System.out.println("주소를 입력 해 주세요.");
      String addr = kb.nextLine();
      
      
      Friend Friend = null;
      
      if(choice == 1) {
         // 1일 때 정보받기
         System.out.println("직업을 입력 해 주세요.");
         String work = kb.nextLine();
         
         // HighFriend 인스턴스 생성
         Friend = new HighFriend(name, phoneNum, addr, work);
      }else {
         
         // 2일 때 정보받기
         System.out.println("전공을 입력 해 주세요.");
         String major = kb.nextLine();
         System.out.println("학년을 숫자로 입력 해 주세요.");
         String grade = kb.nextLine();
         // Integer.parseInt(grade)
         // 문자열을 받아서 정수형 데이터로 반환 해 주는 static 메소드
         
         // UnivFriend 인스턴스 생성
         Friend = new UnivFriend(name, phoneNum, addr, major, Integer.parseInt(grade));
      }
      
      // addFriendInfo 호출
       addFriendInfo(Friend);
   }
   
   // 친구정보의 기본정보 출력 기능.
   void showAllSimpleData() {
      
      System.out.println("=====친구의 기본정보를 출력합니다.=====");
      
      for(int i=0; i<myFriends.size(); i++) {
         myFriends.get(i).showBasicInfo();
         System.out.println("-----------------------------");
      }
   }
   
   // 친구정보의 상세정보 출력 기능.
   void showAllData() {
      
      System.out.println("=====친구의 모든 정보를 출력합니다.=====");
      
      for(int i=0; i<myFriends.size(); i++) {
         myFriends.get(i).showData();
         System.out.println("-----------------------------");
      }
   }  
}