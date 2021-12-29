package 반복문;

public class ForExam3 {
    public static void main (String[] args) {
        // for(int i=1 ; i<=5; i++) {
        //     for (int j = 1; j < i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        String star = "*";
        for (int i = 1; i <=5; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
