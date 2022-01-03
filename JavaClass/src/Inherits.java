public class Inherits {
    public static void main(String[] args) {
        Mother mother = new Mother();
        System.out.println(mother);

        Son son = new Son();
        // son.printMotherAge();

        son.setBloodType("A");
        System.out.println(son.getBloodType());
    }
}

// 부모클래스
class Mother {
    int motherAge = 50;
    String hometown = "경상도";
    boolean inMerryed = true;
    String bloodType = "o";

    public Mother() {
        System.out.println("Welcome to super class");
    }
}

// 자식 클래스 (부모 클래스 상속)
class Son extends Mother {
    int sonAge = 23;
    String hometown = "서울";
    //Son에 bloodType를 선언하지 않았는데, 정말 블러드타입을 생성하는지

    public Son() {
        System.out.println("welcome to sub class");
    }

    public void printMotherAge() {
        System.out.println("Mother's Age" + super.motherAge);
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}