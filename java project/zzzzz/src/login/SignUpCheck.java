package login;

import java.util.Scanner;
 
public class SignUpCheck {
   
   // 이거 (void) 있어야 main에 넘어가서 출력가능한거 맞아요?
   void signUpdb() {
   
   Scanner sc = new Scanner(System.in);
   
   String yes = null;
   String no = null;
   
   System.out.println("회원가입이 되어있나요? (yes / no 로 입력해주세요.)");
   String yn = sc.nextLine();
   
   if(yn == yes) {
      System.out.println("로그인 창으로 이동합니다.");
      // Login 클래스 연결(가능한 부분?)
   }else {
      System.out.println("회원가입 창으로 이동합니다.");
      // SignUp 연결(가능해요?)
   }
   
   
}
   
}