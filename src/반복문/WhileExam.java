package 반복문;

public class WhileExam {
    public static void main(String[] args) {
        char num = 65;
        while(true) {
            String str = String.valueOf(num);
            System.out.print(str);
            num++;

            if(num >= 91){
                break;
            }
        }
    }
}
