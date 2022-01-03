package homework.day03;

public class OOP { 
    public static void main(String[] args) { 
        Animal goroke = new Animal(); 
        goroke.happyness = 50; 
        goroke.happy(); 
        System.out.printf("현재 로케의 기분 좋은 정도는 %d %%입니다.%n", goroke.happyness); 
        goroke.sad(); 
        System.out.printf("현재 로케의 기분 좋은 정도는 %d %%입니다.", goroke.happyness); 
    } 
}
