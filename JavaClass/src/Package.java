import vehicle.car.sportsCar.*;

public class Package {
    public static void main(String[] args) {
        맥라렌 m = new 맥라렌 ();
        람보르기니 l1 = new 람보르기니();
        람보르기니 l2 = new 람보르기니();
        람보르기니 l3 = new 람보르기니();
        System.out.println(m);

        l1.setName("1번 람보르기니");
        l2.setName("2번 람보르기니");
        l3.setName("3번 람보르기니");

        System.out.println(l1.getName());
        System.out.println(l2.getName());
        System.out.println(l3.getName());
        
        l1.setPrice(100000000);
        l2.setPrice(200000000);
        l3.setPrice(300000000);

        System.out.println(l1.getPrice());
        System.out.println(l2.getPrice());
        System.out.println(l3.getPrice());
    }
}
