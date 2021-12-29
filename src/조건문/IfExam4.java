package 조건문;
import java.util.*;

class IfExam4 {
    public static void main(String[] args) {
        // int a = 4;
        // int b = 2;
        // boolean c = false;

        // if (a == 4 && b%2 == 0 && c!= true) {
        //     System.out.println("정답입니다.");
        // }
        int A;
        int B;
        boolean C;
        Scanner scanner = new Scanner(System.in);
        System.out.print("A : ");
        A = scanner.nextInt();
        System.out.print("B : ");
        B = scanner.nextInt();
        System.out.print("C : ");
        C = scanner.nextBoolean();

        if (A == 4){
            if (B%2 ==0){
                if (C == true){
                    System.out.println("정답");
                }
            }
        }
        scanner.close();
    }
}
