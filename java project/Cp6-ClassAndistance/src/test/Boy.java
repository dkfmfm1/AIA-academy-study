package test;

import card.Card;

public class Boy {// test.boy

//	다음조건을 만족하는 클래스를 구성하자. 구슬치기와 딱지치기
//	어린아이가 소유하고 있는 구슬의 개수 정보를 담을 수 있다.
//	놀이를 통한 구슬을 주고받음을 표현하는 메서드가 존재한다.
//	두 번째 조건은 두 아이가 구슬치기를 하는 과정에서 구슬의 잃고 얻음을 의미하는 것이다.
//	조건을 만족하는 클래스를 정의하였다면, 다음조건을 만족하는 인스턴스를 각각 생성하자. ( 하나의 클래스만 작성하자 )
//	어린이 1의 보유자산  구슬 15개
//	어린이 2의 보유자산  구슬 9개
//	인스턴스의 생성이 완료되면 다음의 상황을 main 메서드 내에서 시뮬레이션 하자.
//	“1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다”
//	“2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다.”
//	마지막으로 각각의 어린이의 보유 구슬의 개수를 출력하고 프로그램 종료.
	
	
	Card c = new Card();
	
	//구슬의 개수
	int numOfMarble;
	
	Boy(int num){
		numOfMarble = num;
	}
	
	//구슬 개수를 설정할 수 있는 메서드
	void setMarble(int num) {
		numOfMarble = num;
	}
	
	void gameWin(Boy boy, int num) { //boy는 상대방
		numOfMarble += num; //내가 이겼으니까
		boy.numOfMarble -= num; //상대방은 져서
	}
	
	
	void showData() {
		System.out.println("현재 보유한 구슬의 개수는 " + numOfMarble + " 개 입니다");
	}
	
	
	//다음 조건을 충족하는 인스턴스를 각각 생성하자 부분
	public static void main(String[] args) {
		
		//철수 생성
		Boy boy1 = new Boy(15);
		//영희 생성
		Boy boy2 = new Boy(9);
		
		// 철수는 구슬을 15개 보유, 영희는 구슬을 9개 보유
		//boy1.setMarble(15);
		//boy2.setMarble(9);
		
		System.out.println("철수는 구슬을 " +boy1.numOfMarble+ "개 보유, 영희는 구슬을 " +boy2.numOfMarble+ "개 보유");
		
		// 1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다
		System.out.println("1차 게임에서 철수는 영희의 구슬 2개를 획득한다");
		
		boy1.gameWin(boy2, 2);
		
		System.out.println("철수");
		boy1.showData();
		System.out.println("영희");
		boy2.showData();
		
		System.out.println("-------------------------------------------------");
		
		// 2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다.
		System.out.println("2차 게임에서 영희는 철수의 구슬 7개를 획득한다");
		
		boy2.gameWin(boy1, 7);
		
		System.out.println("철수");
		boy1.showData();
		System.out.println("영희");
		boy2.showData();
		
		
	}
	
}


