package login;

import java.util.Scanner;

public class Manager {


   // 회원 객체
   Infor[] member;
   int cnt;
   Scanner sc;
   
   
   public Manager() {
      member = new Infor[100000];
      cnt = 0;
      sc = new Scanner(System.in);
   }
   
   
   void addInfo(Infor info) {
      member[cnt] = info;
      cnt++;   
   }
   
   void addInfo() {
      member[cnt] = signUpInstance();
      cnt++;
   }
   

Infor signUpInstance() {
   
   Infor info = null;
   
      System.out.println("*** 회원가입 페이지입니다***");
      
      System.out.println("이름을 입력해주세요.");      
      String name = sc.nextLine();
      
      System.out.println("이메일을 입력해 주세요.");
      String email = sc.nextLine();
      
      System.out.println("아이디를 입력해 주세요.");
      String id = sc.nextLine();
      
      System.out.println("비밀번호를 입력해 주세요.");
      String password = sc.nextLine();
      
      while((name==null||name.trim().isEmpty())||(email==null||email.trim().isEmpty())||
        (id==null||id.trim().isEmpty())||(password==null||password.trim().isEmpty())) {
         System.out.println("입력되지 않은 항목이 있습니다. 모든 항목을 빠짐없이 입력해주세요.");
         break; // 회원가입페이지입니다. 부터 다시나오게 하는 방법을 모르겠어요.
      }
      
      System.out.println("회원가입이 완료되었습니다.");
      
      info = new Infor(name, email, id, password);
      
      return info;
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
   
   	if(id.equals(member)&&password.equals(member)) {
   		System.out.println("로그인 되었습니다.");
   	}else {
   		System.out.println("가입된 정보가 없습니다.");
   		
   	}
   
   
}


void showAllData() {
   
   for(int i=0; i<cnt; i++) {
      member[i].showInfor();
      System.out.println("------------");
   }

}


int searchIndex(String name) {
   
   int searchIndex = -1;
   
   for(int i=0; i<cnt; i++) {
      if(member[i].checkName(name)) {
         searchIndex = i;
         break;
      }
   }
   
   return searchIndex;
   
}



void searchInfo() {
   
   System.out.println("검색하고자하는 아이디를 입력해주세요");
   String id = sc.nextLine();
   
   int searchIndex = searchIndex(id);
   
   
   if(searchIndex<0) {
      System.out.println("존재하지 않는 아이디입니다.");
   } else {
      member[searchIndex].showInfor();
   }
   
}


void deleteInfo() {
   
   System.out.println("삭제하고자하는 아이디를 입력해주세요");
   String id = sc.nextLine();
   
   int searchIndex = searchIndex(id);
   
   if(searchIndex<0) {
      System.out.println("존재하지 않는 아이디입니다.");
   } else {
      
      for(int i=searchIndex; i<cnt-1; i++) {
         member[i]=member[i+1];
      }
            
      cnt--;
      
      System.out.println("요청하신 아이디를 삭제했습니다.");
      
   }

}

}