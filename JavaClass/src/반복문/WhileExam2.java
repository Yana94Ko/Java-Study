package 반복문;

public class WhileExam2 {
    public static void main(String[] args) {
        //1부터 10까지의 합을 구하시오
        int num = 1;
        int sum = 0;

        while(num<=10) {
            sum += num;
            num++;
        }
        System.out.print("1부터 10까지의 합 = "+sum);
    }
}
