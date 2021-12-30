package 배열;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70; // 는 score[2] = 70과 같음.
        score[3] = 80;
        score[4] = 90;

        // 배열의 모든 요소 출력(by for문)
        for (int i = 0; i<5; i++) {
            System.out.printf("score [%d] : %d%n", i, score[i]);
        }

        // 배열 길이
        System.out.printf("length : %d%n", score.length);

        // 배열의 범위를 벗어난 값의 예외처리
        System.out.printf("score[%d] : %d%n", 7, score[7]);
    }
}
