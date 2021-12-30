package 배열;

public class ArrayEx05 {
    public static void main(String[] args) {
        int [] score = new int[] {50,60,70,80,90};
        
        System.out.printf("score[%d] + score[%d] = %d",0,score.length-1,score[0]+score[4]);
    }
}
