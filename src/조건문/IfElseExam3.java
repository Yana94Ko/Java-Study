package 조건문;
public class IfElseExam3 {
    public static void main(String[] arge){
        int a = 10, b = 20, c = 9;
        int max;
        if ( a > b && a > c ) {  // a는 가장 큰 수 인가?
            max = a;             // 참이면 a를 max로
        } else {                 // a가 최대값이 아니라면, b와 c 비교
            if (b > c) {         // b가 c 보다 크면 
                max = b;         // max는 b
            } else {             // b가 c 보다 크지 않으면
                max = c;         // max는 c
            }
        }
        System.out.println("max = " + max);
    }

}


// Scanner scan = new Scanner (System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int c = scan.nextInt();

//         int max = a;
//         if( b > max ) max = b;
//         if( c > max ) max = c; 박경태
