package login;

public class Infor {
   
   String name;
   String email;
   String id;
   String password;
    
   Infor(String name, String email, String id, String password){
      this.name = name;
      this.email = email;
      this.id = id;
      this.password = password;
   }
   
   void showInfor() {
      System.out.println("이름 : " + this.name);
      System.out.println("이메일 : " + this.email);
      System.out.println("아이디 : " + this.id);
      System.out.println("비밀번호 : " + this.password);
   }
   
   boolean checkName(String id) {
      return this.id.equals(id);
   }
}