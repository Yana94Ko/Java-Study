package 배열;

public class ArrayEx06 {
    public static void main(String[] args) {
        // 배열에 100, 88, 100, 100, 90 을 입력하고 총합과 평균을 출력하시오
        int [] score = new int [] {100, 88, 100, 100, 90};
        int sum = 0;

        for (int i : score) {
            sum += i;
        }
        System.out.printf("총합 : %d%n", sum);
        System.out.printf("평균 : %d", sum/score.length);
    }
}
