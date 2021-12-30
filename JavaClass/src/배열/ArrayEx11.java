package 배열;
import java.util.*;


public class ArrayEx11 {
    public static void main(String[] args) {
        int [] coines = new int [] {500,100,50,10};      //거스름돈 종류 배열
        int [] result = new int [] {0,0,0,0};            //개수 담을 배열

        System.out.print("거스름돈 총액을 입력하세요 : "); //입력받기
        Scanner scanner = new Scanner(System.in);
        int changes = scanner.nextInt();

        for (int i = 0; i < coines.length; i++) {      
            result[i] = changes / coines[i];
            changes = changes % coines[i];
            System.out.printf(" %d원 : %d개 %n", coines[i],result[i]);
        }
        scanner.close();
    }
}
