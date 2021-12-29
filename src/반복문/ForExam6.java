package 반복문; //마름모 만들기

public class ForExam6 {
    public static void main(String[] args) { 
        for (int i = 1; i <=3 ; i++) {     
            for (int j = 3; j>=i; j--) {      // i = 1 -> 2 - >3
                System.out.print(" ");        // j = 3회 출력(3,2,1) -> 2회 출력(3,2)-> 1회 출력(3)
            }
            for (int k = 1; k<=2*i-1; k++) {
                System.out.print("*");        // k = 1회 출력()-> 3회 출력 -> 5회 출력
            }
            System.out.println();
        }
        for (int l = 2; l >=1 ; l--) {        // l = 2 -> 1
            for (int m = 3; m>=l; m--) {      // m = 2회 출력(m=3,2)-> 3회 출력(m=3,2,1)
                System.out.print(" ");
            }
            for (int n = 1; n<=2*l-1; n++) {  // n = 3회 출력(1,2,3) - >1회 출력(1)
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
