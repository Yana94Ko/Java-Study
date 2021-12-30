package 반복문;

public class DoWhileExam2 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i + ". do while"); // 실행문
            i++; // 증감식
        } while (i<1);  // 조건식에는 들어맞지 않지만 doWhile이기 때문에 우선 1회는 실행
    }    
}
