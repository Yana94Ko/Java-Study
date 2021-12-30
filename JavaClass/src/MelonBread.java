package 배열;

import java.util.*;

public class ArrayEx10 {
    public static void main(String[] args) {
        int bananaMilk = 0;
        int melonPpang = 0;
        Boolean yesOrNoMellonPpang;
        String [] buyWhat = new String [] {"바나나우유","메론빵"};
        int [] howMuchBuy = new int [] {0,0};

        System.out.print("매점에 메론빵이 있나요?(true/false) : ");
        Scanner store = new Scanner(System.in);
        yesOrNoMellonPpang = store.nextBoolean();

        if (yesOrNoMellonPpang==false) {
            bananaMilk = 2;
        } else {
            bananaMilk = 4;
        }

        if(bananaMilk !=0) {
            howMuchBuy[0] = bananaMilk;
        }
        if(melonPpang!=0) {
            howMuchBuy[1] = melonPpang;
        }

        System.out.print("사온 것 : ");
        for (int i=0; i<buyWhat.length;i++) {
            System.out.print(buyWhat[i]+" "+howMuchBuy[i]+"개\t");
        }
        store.close();
    }
}
