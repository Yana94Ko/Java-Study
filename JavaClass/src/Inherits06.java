class Parent2 {
    void display() { 
        System.out.println("부모 클래스의 display() 메소드입니다."); 
    }
}
class Child2 extends Parent2 {

    // 오버라이딩된 display() 메소드
    void display() {
        System.out.println("자식 클래스의 display() 메소드입니다."); 
        }

    void display(String str) { 
        System.out.println(str); 
    } // 오버로딩된 display() 메소드
}
 
public class Inherits06 {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.display();
        ch.display("오버로딩된 display() 메소드입니다.");
    }
}