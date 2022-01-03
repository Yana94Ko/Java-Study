public class Parent {
    private int a = 10; // private 필드
    public int b = 20;  // public 필드
    
    void hayhayhay(){
        System.out.println(a);
    }

}

class Child extends Parent {
    public int c = 30;  // public 필드

    void display() {
        //protected : 동일클래스, 동일패키지, 자식클래스 사용. 그 외 X
    //   System.out.println(a); // 상속받은 private 필드 참조 => 동일클래스에서만!
      System.out.println(b);    // 상속받은 public 필드 참조 -> 자식클래스, 내패키지, 다른패키지까지 모두 접근 가능
      System.out.println(c);    // 자식 클래스에서 선언한 public 필드 참조
    }
}

class PrivateTest {
    public static void main(String[] args) {
        // 선언, 객체화 : Parent, Child
        Parent parent = new Parent();
        Child child = new Child();

        child.display();
        System.out.println(parent);
    }
}