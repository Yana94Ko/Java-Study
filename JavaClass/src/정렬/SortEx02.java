package 정렬;

import java.util.Arrays;

//삽입정렬
public class SortEx02 {
    public static void main(String[] args) {
        int [] arr = {7,5,9,0,3,1,6,2,4,8};

        for (int i = 1 ; i < arr.length; i++) {
            for (int j = i; j>=1; j--) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr [j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                } else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
