package test;

public class Triangle {
	
	//밑변과 높이 정보를 지정할 수 있는 Triangle 클래스를 정의하자.
	//끝으로 밑변과 높이 정보를 변경시킬 수 있는 메서드와 삼각형의 넓이를 계산해서 반환하는 메서드도 함께 정의하자.
	
	
	// 변수 : 밑변, 높이
	int width; // 밑변의 데이터
	int height; // 높이 데이터
	
	// 생성자 : 인스턴스 생성시에 반드시 한번 실행 --> 인스턴스변수들의 초기화 작업
	// 			생략 가능(default Contructor)
	
	// 기본 생성자(class이름은 반드시 class이름/임의의 이름 생성 불가)
	Triangle(){
		
	}
	
	// 데이터 두개를 받아서 저장하는 생성자(얘 있으면 위에 기본생성자 생략 불가??)
	Triangle(int w, int h){
		width = w;
		height = h;
	}
	
	
	
	
	
	// 밑변과 높이 데이터를 변경하는 메서드(반환을 하느냐, 매개변수가 있느냐를 따짐)
	void setData(int w, int h) {//int w, int h 는 지역변수
		width=w;
		height=h;
	}
	
	// 삼각형의 넓이를 구해서 반환하는 메서드
	float area() {
		float result = width*height/2f;//float 접미사 붙임
		return result;
	}
	
	public static void main(String[] args) {
		
		// 삼각형 객체 생성
		//Triangle t = new Triangle();
		Triangle t = new Triangle(5,3); //메서드의 호출은 매개변수가 해줌(5,3)
		
		// 데이터 설정
		t.setData(5,3);
		System.out.println("삼각형의 밑변 : " + t.width + ",  높이 : " + t.height);
	
		// 넓이를 구하는 메서드 실행
		System.out.println("삼각형의 넓이는 " + t.area() + " 입니다.");
	}
}
