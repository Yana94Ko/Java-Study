package 반복문;

import java.util.*;

public class ForExam8 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();

        for (int i = num; i <= num*10 ; i+=num) {
            System.out.print(i + " ");
        }
    }
}