package ex;

public class Sum {

	long num;
	
	Sum(){
		num = 0;
	}
	
	// 1씩 더해주는 메서드
	void addNum(long n) {
		num+=n; // num = num+n;
	}
	
	// 현재 갖고있는 값
	long getNum() {
		return num;
	}
	
}
