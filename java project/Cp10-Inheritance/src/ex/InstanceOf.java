package ex;

public class InstanceOf {

   public static void main(String[] args) {
      Box box1 = new Box();
      Box box2 = new PaperBox();
      Box box3 = new GoldPaperBox();

      wrapBox(box1);
      wrapBox(box2);
      wrapBox(box3);

   }

   public static void wrapBox(Box box) {// 상위클래스 Box가 결과의 내용들을 갖고있어야됨??
      box.wrap();
   }

}

// 클래스마다? 일일이 형변환 할 필요 없이 
// 오버라이딩으로 출력메서드 하나만 있으면 다 출력되게
class Box {
   public void wrap() {
      System.out.println("simple wrap");
   }
}

class PaperBox extends Box {
   public void wrap() {
      System.out.println("Paper wrap");
   }
}

class GoldPaperBox extends PaperBox {
   public void wrap() {
      System.out.println("gold wrap");
   }
}