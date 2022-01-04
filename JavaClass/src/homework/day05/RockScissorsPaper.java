package homework.day05;

public class RockScissorsPaper {
    public static void main(String[] args) {
        RSP rsp = new RSP();

        System.out.print("참가자 :");
        
        for (int j = 0; j < Player.player.length; j++){
            System.out.print(Player.player[j]+" ");
        }
        System.out.println();
        rsp.chooseRSP();

        System.out.printf(RSP.result);
        
    }
}
//플레이어 만들어주기
class Player{
    public static String [] player = new String [] {"철수", "영희"};
}

//랜덤으로 가위 바위 보 중 하나 내는 객체 만들기
class RSP extends Player {
    int [] randomnum = new int [2];
    String [] what = new String [2];
    static String result;

    
    String getResult(){
        return result;
    }

    void chooseRSP(){
        for (int i = 0; i <randomnum.length;i++) { 
            randomnum[i] = (int)(Math.random()*3);
            switch (randomnum[i]){
                case 0 :
                    what[i] = "가위";
                    break;
                case 1 : 
                    what[i] = "바위";
                    break;
                case 2 :
                    what[i] = "보";
                    break;
            }
            System.out.printf(player[i]+"는 "+what[i]+"를 냈습니다.%n");  
        }
        if(what[0]=="가위") {
            switch (what[1]){
                case "가위" :
                    result = "비겼습니다";
                case "바위" :
                    result = player[1]+"(이)가 이겼습니다";
                case "보" :
                    result = player[0]+"(이)가 이겼습니다";
            }
        }else if(what[0]=="바위"){
            switch (what[1]){
                case "가위" :
                    result = player[0]+"(이)가 이겼습니다";
                case "바위" :
                    result = "비겼습니다";
                case "보" :
                    result = player[1]+"(이)가 이겼습니다";
            }
        } else {
            switch (what[1]){
                case "가위" : 
                    result = player[1]+"(이)가 이겼습니다";
                case "바위" :
                    result = player[0]+"(이)가 이겼습니다";
                case "보" :
                    result = "비겼습니다";
            }
        }

    }
}