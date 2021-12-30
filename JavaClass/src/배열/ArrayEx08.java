package 배열;

public class ArrayEx08 {
    public static void main(String[] args) {
        // int a = 10, b = 20, temp = 0;

        // System.out.println("a 는 "+ a);
        // System.out.println("b 는 "+ b);

        // temp = a;
        // a = b;
        // b = temp;

        // System.out.println("a 는 "+ a);
        // System.out.println("b 는 "+ b);

        int [] score = new int [] {75,100,85,60,95};
        int [] rank = new int [] {1,1,1,1,1};

        for (int i = 0; i < score.length; i++) { 
            rank[i] = 1;           
            for(int j = 0; j<score.length; j++){
                if(score[i] < score[j]) {
                    rank[i] += 1;
                }
            }
        }
        for(int k = 0; k < score.length; k++) {
            System.out.println("점수 : "+ score[k]+" 순위 : "+rank[k]);
        }
    }
}
