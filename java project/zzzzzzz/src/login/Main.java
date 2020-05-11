package login;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
      Manager manager = new Manager();
      Manager1 manager1 = new Manager1();
            
      Scanner sc = new Scanner(System.in);
      
      while(true) {
         
         Menu.showMenu1();
         int selectNum = sc.nextInt();
         sc.nextLine();
         
         if(selectNum==1) {//관리자
        	 
            Menu.showMenu2_1();
            sc.nextLine();
            if(selectNum==1) {
            
              
                  manager1.loginInfo();//로그인
                  sc.nextLine();
                  if(selectNum==1) {
                  
                        // 전체 리스트 출력
                        manager.showAllData();
                        
                     }
            } else {
                  manager1.addInfo1();//회원가입
            }
        	
            
            
         } else { //사용자
        	 
       	 
        Menu.showMenu2_2();
        sc.nextLine();
        if(selectNum==1) {
        
           manager.loginInfo();//로그인
           sc.nextLine();   
           Menu.showMenu3();
           sc.nextLine();
              switch(selectNum) {
              
              case 1:
                 // 이름으로 검색
                 manager.searchInfo();
                 break;
              case 2:
                 // 이름으로 검색후 삭제
                 manager.deleteInfo();
                 break;
              case 3 :
            	  // 상품목록보기
            	 break;
              case 4: 
                 //return;
                 System.out.println("EverPets를 이용해주셔서 감사합니다. 안녕히가세요.");
                 System.exit(0);   
                 break;
           }
        }
      else {

      manager.addInfo(); //회원가입
    
      }
        
 
        
         }
         
      }

   }

}