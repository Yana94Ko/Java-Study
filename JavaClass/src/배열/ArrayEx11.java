package 배열;
import java.util.*;

public class ArrayEx11 {
    public static void main(String[] args) {
        int [] coines = new int [] {500,100,50,10};      //거스름돈 종류 배열
        int [] result = new int [] {0,0,0,0};            //각 돈별 개수 담을 배열 생성(0으로 초기화)

        System.out.print("거스름돈 총액을 입력하세요 : "); //입력받기
        Scanner scanner = new Scanner(System.in);
        int changes = scanner.nextInt();        // changes : 줘야 하는 잔돈

        for (int i = 0; i < coines.length; i++) {     

            // 동전별 필요한 갯수를 찾기 위해, 거스름 총액을 큰 돈(500원)부터 시작해서 나눠서, 
            // 몫 즉, 해당 동전이 필요한 갯수를 구함
            result[i] = changes / coines[i]; 

            //해당 동전이 몇 개 필요한지 출력
            System.out.printf(" %d원 : %d개 %n", coines[i],result[i]);

            // 큰 돈으로 구성 가능한 잔돈은 위에서 줬으니, 
            // 그 다음 작은 돈으로 줄 수 있는 잔돈을 계산하기 위해, 
            // 큰돈을 주고나서 남은 "줘야하는 잔돈"을 바꿔줌
            changes = changes % coines[i];  
        }
        scanner.close();
    }
}
