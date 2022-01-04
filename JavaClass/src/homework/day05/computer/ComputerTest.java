package homework.day05.computer;


public class ComputerTest{
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOnOff();
    }
}

class Computer {
    private boolean power = false;
    private int price;

    public int getPrice(){
        return price;
    }

    public boolean getPower(){
        return power;
    }
    public void setPower(boolean power) {
        this.power = power;
    }
    
    Computer(){
        System.out.println("Show information...");
        Notebook notebook = new Notebook("ASUS","TUF GAMING_RTX 3050TI",1839000);
        Monitor monitor = new Monitor("SAMSUNG","Curved C27F390F", 237000);
        Keybord keybord = new Keybord("씽크웨이", "TOCHEF BW", 149750);
        Mouse mouse = new Mouse("logitech", "M350", 21150);
        price = Notebook.getPrice() + Monitor.getPrice() + Keybord.getPrice() + Mouse.getPrice();
    }
    public void powerOnOff(){
        if (power = false){
            System.out.println("Loding....");
            setPower(true);
            System.out.println("전원이 켜졌습니다");
        }else{
            System.out.println("전원 끄는중...");
            setPower(false);
            System.out.println("점퓨터가 정상적으로 종료됨.");
        }
    }
}

class ComputerParts {
    private String part;
    private String brand;
    private String model;
    private static int price;

    public String getPart() {
        return part;
    }
    public String getBrand() {
        return brand;
    }
    public String getmodel() {
        return model;
    }
    public static int getPrice() {
        return price;
    }

    public void setPart(String part) {
        this.part = part;
    }   
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(int price) {
        this.price = price;
    }   

    public void setInfo(String brand, String model,int price){
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }
    public void showInfo(){
        System.out.printf("%s는 %s의 %s 모델입니다%n",part, brand, model);
    }
}

class Monitor extends ComputerParts{
    Monitor(String brand, String model, int price){
        setPart("모니터");
        setInfo(brand,model,price);
        showInfo();
    }
}
class Notebook extends ComputerParts{
    Notebook(String brand, String model, int price){
        setPart("노트북");
        setInfo(brand,model,price);
        showInfo();
    }
}
class Keybord extends ComputerParts{
    Keybord(String brand, String model, int price){
        setPart("키보드");
        setInfo(brand,model,price);
        showInfo();
    }
}   
class Mouse extends ComputerParts{
    Mouse(String brand, String model, int price){
        setPart("마우스");
        setInfo(brand,model,price);
        showInfo();
    }
}  
