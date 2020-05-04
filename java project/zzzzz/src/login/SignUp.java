package login;

import java.util.Scanner;

public class SignUp { 

   String name;
   String birthday;
   String email;
   String id;
   String password;

   SignUp(String name, String birthday, String email, String id, String password) {
      this.name = name;
      this.birthday = birthday;
      this.email = email;
      this.id = id;
      this.password = password;
   }

   // 고객 수
   int cNum = 0;

   Scanner sc = new Scanner(System.in);

   // 배열
   Login[] customer;

   // 생성자
   public SignUp() {
      // 배열 초기화
      customer = new Login[cNum];

   }

   // 저장 : 아이디, 비밀번호 정보를 대상으로 하는 저장
   // 배열에 Login 타입의 참조값을 저장
   void addInfo(Login info) {

      // 배열에 요소 대입
      customer[cNum] = info;

      // 등록된 정보의 개수를 증가
      cNum++;

   }

   // 사용자의 입력데이터로 PhoneInfor 객체를 생성
   Login createInstance() {

      Login info = null;

      Scanner sc = new Scanner(System.in);

      System.out.println("회원정보 창입니다.");
      
      System.out.println("이름을 입력해주세요.");
      String name = sc.nextLine();
      System.out.println("생년월일을 입력해주세요.");
      String birthday = sc.nextLine();
      System.out.println("이메일을 입력해주세요.");
      String email = sc.nextLine();
      System.out.println("아이디를 입력해주세요.");
      String id = sc.nextLine();
      System.out.println("비밀번호를 입력해주세요.");
      String password = sc.nextLine();

      // 입력안된 항목 있으면 다시 "이름을 입력해주세요"로 돌아감
      if(name == null || birthday == null || email == null || id ==null || password == null) {
         System.out.println("입력되지 않은 값이 있습니다. 다시 입력해주세요");
      }
      
      return info;

   }

   // 전체 리스트 출력
   void showAllData() {

      // 전체 데이터 --> 입력된 데이터의 개수 cNum
      for (int i = 0; i < cNum; i++) {
         customer[i].showInfo();
         System.out.println("-----------------------------");
      }

   }

   // 배열에서 이름을 기준으로 검색 후 index 값을 반환
   int searchIndex(String name) {

      int searchIndex = -1;

      // 사용자가 입력한 이름으로 배열에 요소를 검색 --> index를 찾아야함
      for (int i = 0; i < cNum; i++) {
         if (customer[i].checkName(name)) {
            searchIndex = i;
            break;
         }
      }

      return searchIndex;

   }


   // 삭제: 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제
   void deleteInfo() {
            
      System.out.println("삭제하고자하는 이름을 입력해주세요");
      String name = sc.nextLine();
      
      int searchIndex = searchIndex(name);
      

      // 삭제
      // pBooks[2] : 삭제, pBooks[2] = null
      // 데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
      // 재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.
      
      
      if(searchIndex<0) {
         System.out.println("찾으시는 이름의 데이터가 존재하지 않습니다");
      }else {
         
         // 삭제 : 검색한 index부터 저장된 위치까지 왼쪽으로 시프트
         for(int i=searchIndex; i<cNum-1; i++) {
            customer[i]=customer[i+1];
         }
         
         // 저장된 정보의 개수를 -1
         cNum--;
         
         System.out.println("요청하신 이름의 정보를 삭제했습니다");
         
//   void showSignUpInfo() {
//   
//   
//   System.out.println("회원정보 창입니다.");
//   
//   System.out.println("이름을 입력해주세요.");
//   String name = sc.nextLine();
//   System.out.println("생년월일을 입력해주세요.");
//   String birthday = sc.nextLine();
//   System.out.println("이메일을 입력해주세요.");
//   String email = sc.nextLine();
//   System.out.println("아이디를 입력해주세요.");
//   String id = sc.nextLine();
//   System.out.println("비밀번호를 입력해주세요.");
//   String password = sc.nextLine();
//   
//   // 입력안된 항목 있으면 다시 "이름을 입력해주세요"로 돌아감
//   
//   // 입력 다 됐으면
//   // System.out.println("회원가입 되었습니다.");
//   // Login 클래스로 넘어감(가능??)
//   
//   
//   
//   
   }
}
}