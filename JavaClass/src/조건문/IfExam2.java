package 조건문;
import java.util.*;

class IfExam2 {
    public static void main(String[] args) {
        int input;
        System.out.print("숫자를 하나 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);
        if (input < 10) {
            System.out.println("10보다 작습니다");
        }
        scanner.close();
    }
}
