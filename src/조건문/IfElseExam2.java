package 조건문;
// import java.util.*;

public class IfElseExam2 {
    public static void main(String[] args) {
        // System.out.print("점수를 입력하세요. : "); //입력받아 진행하는 방법
        // Scanner scanner = new Scanner(System.in);

        double dValue = Math.random(); //난수발생코드
        int score = (int)(dValue * 100+1); //0~100 난수 발생

        // score = scanner.nextInt();
        if (score <= 60) {
            System.out.println("가");
        }
        else {
            if (61<=score &&score <=70 ) {
            System.out.println("양");
            }
            else {
                if (71<=score &&score <=80 ) {
                System.out.println("미");
                }
                else {
                    if (81<=score &&score <=90 ) {
                        System.out.println("우");
                    }
                    else {
                        System.out.println("수");
                    }
                }
            }
        }
        // scanner.close();
    }
}
