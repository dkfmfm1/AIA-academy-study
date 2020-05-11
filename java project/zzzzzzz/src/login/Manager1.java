package login;

import java.util.Scanner;

public class Manager1 {

   // 관리자 객체
   Infor[] member1;
   int cnt;
   Scanner sc;
   
   
   public Manager1() {
      member1 = new Infor[100000];
      cnt = 0;
      sc = new Scanner(System.in);
   }
   
   
   void addInfo1(Infor info) {
      member1[cnt] = info;
      cnt++;   
   }
   
   void addInfo1() {
      member1[cnt] = signUpInstance1();
      cnt++;
   }
   

Infor signUpInstance1() {
   
   Infor info = null;

   while(true) {
   		
      System.out.println("*** 회원가입 페이지입니다***");
      
      System.out.println("이름을 입력해주세요.");      
      String name = sc.nextLine();
      
      System.out.println("이메일을 입력해 주세요.");
      String email = sc.nextLine();
      
      System.out.println("아이디를 입력해 주세요.");
      String id = sc.nextLine();
      
      System.out.println("비밀번호를 입력해 주세요.");
      String password = sc.nextLine();
      
     if((name==null||name.trim().isEmpty())||(email==null||email.trim().isEmpty())||
          (id==null||id.trim().isEmpty())||(password==null||password.trim().isEmpty())) {
            System.out.println("입력되지 않은 항목이 있습니다. 모든 항목을 빠짐없이 입력해주세요.");
           continue; // 회원가입페이지입니다. 부터 다시나오게 하는 방법을 모르겠어요.
         }
      
      System.out.println("회원가입이 완료되었습니다.");
      
      info = new Infor(name, email, id, password);
      
      return info;
   }
   }


void loginInfo() {
	   System.out.println("=======================");
	   System.out.println("*** 로그인 페이지입니다 ***");
	   System.out.println("아이디를 입력해주세요.");
	   // 회원가입에 저장된 데이터랑, 로그인할 때 사용자한테서 입력받는 데이터를 비교하는 방법을 모르겠어요
	   	String id = sc.nextLine();
	   	
	   System.out.println("비밀번호를 입력해주세요.");
	   // 회원가입에 저장된 데이터랑, 로그인할 때 사용자한테서 입력받는 데이터를 비교하는 방법을 모르겠어요
	   	String password = sc.nextLine();
	   
	   	if(id.equals(member1)&&password.equals(member1)) {
	   		System.out.println("로그인 되었습니다.");
	   	}else {
	   		System.out.println("가입된 정보가 없습니다.");
	   		
	   	}
	   
	   
	}
}