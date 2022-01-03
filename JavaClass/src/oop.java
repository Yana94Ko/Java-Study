// import vehicle.*;

public class oop {
    public static void main(String[] args) {
        //4일차 OOP
        // Product product1 = new Product();  // 오토바이 1
        // Product product2 = new Product();  // 오토바이 2
        Product product3 = new Product();  // 오토바이 3
        // Product product4 = new Product();  // 오토바이 4
        // Product product5 = new Product();  // 오토바이 5
        // Product product6 = new Product();  // 오토바이 6

        //product3.price = 300000;           // 가격책정 변수에 300000저장
        product3.setPrice(18000);        //가격 변화 : 18000
        // product3.setPrice(24000);        //가격 변화 : 24000
        // System.out.println(product3.price);
        product3.motorOn();                // 수동키로 모터 온
        //System.out.println(product3.motor);
        product3.motorOff();               // 수동키로 모터 오프
        //System.out.println(product3.motor);
        product3.motorOnOff();             // 자동키로 모터 온
        //System.out.println(product3.motor);
        product3.motorOnOff();             // 자동키로 모터 오프
        //System.out.println(product3.motor);

        // Product product7 = new Product(1000000);  // 오토바이 7
        // Product product8 = new Product("빨강",12);  // 오토바이 7
    }

}

class Product{
    String color;    // 텍스트로 된 color 속성을 쓸거야
    boolean motor;   // 참 거짓 형태로 된 motor 속성을 쓸거야
    int width;
    int height;
    int depth;
    int price;

    Product() {

        System.out.println("This is 생성자");
    }
    Product(int price) {
        this("빨강",15);
        this.price = price;
        System.out.println("This 오토바이 가격은 "+this.price+"입니다");
    }
    Product(String color, int height) {
        this.color = color;
        this.height = height;
        System.out.println("This is "+this.color+"색에 키가 "+this.height+"미터 만한 오도방구입니다.");
    }
    Product(Product p) {
        color = p.color;
        height = p.height;
    }

    void motorOn() {
        this.motor = true;
        System.out.println(this.motor);
    }
    void motorOff() {
        this.motor = false;
        System.out.println(this.motor);
    }
    boolean motorOnOff(){
        this.motor = !this.motor;
        System.out.println(this.motor);
        return this.motor;
        
    }
    int setPrice (int price) {
        this.price = price;
        System.out.println(this.price);
        return this.price;
    }
}