package 조건문;
import java.util.*;

public class IfElseExam1 {
    public static void main(String[] args) {
        int input;
        System.out.print("숫자를 하나 입력하세요. : ");

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        if (input %2 == 0) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }
        scanner.close();
    }
}
