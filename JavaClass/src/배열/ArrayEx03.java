package 배열;

public class ArrayEx03 {
    public static void main(String[] args) {
        char [] chArr = new char [] {'a', 'b', 'c', 'd', 'e'};

        for (int i = 0; i < chArr.length; i++) {
            System.out.printf("chArr[%d] : [%c]%n", i, chArr[i]);
        }
    }
}
