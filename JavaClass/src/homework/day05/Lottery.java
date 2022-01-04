package homework.day05;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        LotteryMachine m = new LotteryMachine();
        m.startMachine();
    }
}

class LotteryMachine {
    public void startMachine(){
        System.out.println("로또 번호를 생성합니다.");
    
        creatNumber();
    }
    public void creatNumber() {
        int[] lotterynumber = new int[7];
        for (int i = 0; i <7; i++) {
            lotterynumber[i] = (int)(Math.random()*45)+1;
        }
        for (int j=0; j < lotterynumber.length; j++) {
            System.out.printf(lotterynumber[j]+" ");
        }
    }
}

