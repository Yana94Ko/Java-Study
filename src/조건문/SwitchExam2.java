package 조건문;
import java.util.*;

public class SwitchExam2 {
    public static void main(String[] args) {
        int num;
        String text = "";
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        switch (num%2) {
            case 1 :
                text = "홀수";
                break;
            case 0 :
                text = "짝수";
                break;
        }
        System.out.printf(text+"입니다");
        scan.close();

        // 삼항 연산자
        // num % 2 == 0 ? 1 : 2
        // (조건식) ? (참인경우 반환할 값) : (거짓인 경우 반환할 값)
    }
}
