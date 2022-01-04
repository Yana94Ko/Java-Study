package homework.day05;

public class RockScissorsPaper {
    public static void main(String[] args) {
        //객체생성
        RSP rsp = new RSP();

        //참가자 리스트 출력을 위한 코드
        System.out.print("참가자 :");
        for (int j = 0; j < Player.player.length; j++){
            System.out.print(Player.player[j]+" ");
        }
        System.out.println();

        //가위바위보 승부내기 코드 실행
        rsp.chooseRSP();

        //result 값에 담긴 승부의 결과 출력
        System.out.printf(RSP.result);
        
    }
}
//플레이어 만들어주기
class Player{
    public static String [] player = new String [] {"철수", "영희"};
}

//랜덤으로 가위 바위 보 중 하나 내는 객체 만들기
class RSP extends Player {
    int [] randomNum = new int [2]; //random 출력한 수를 가위바위보로 바꾸기 전 담아둘 리스트 생성
    String [] what = new String [2];//randomNum에 담아둔 수를 문자열로 바꿔 담기 위한 리스트 생성
    static String result; //출력할 결과문을 담기 위한 문자열 생성

    void chooseRSP(){
        //Math.random을 이용해 3가지중 1개의 값 무작위 추출
        for (int i = 0; i <randomNum.length;i++) {
            //추출한 값을 randomNum 리스트에 담고,
            randomNum[i] = (int)(Math.random()*3);

            // 숫자로 받은 랜덤값을 문자열로 바꿔줌
            switch (randomNum[i]){
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
            // player가 어떤걸 냈는지 출력
            System.out.printf(player[i]+"는 "+what[i]+"를 냈습니다.%n");  
        }
        //가위바위보에 대한 로직
        if(what[0]=="가위") {
            switch (what[1]){
                case "가위" :
                    result = "비겼습니다";//승부 결과 result에 담기
                    break;
                case "바위" :
                    result = player[1]+"(이)가 이겼습니다";
                    break;
                case "보" :
                    result = player[0]+"(이)가 이겼습니다";
                    break;
            }
        }else if(what[0]=="바위"){
            switch (what[1]){
                case "가위" :
                    result = player[0]+"(이)가 이겼습니다";
                    break;
                case "바위" :
                    result = "비겼습니다";
                    break;
                case "보" :
                    result = player[1]+"(이)가 이겼습니다";
                    break;
            }
        } else {
            switch (what[1]){
                case "가위" : 
                    result = player[1]+"(이)가 이겼습니다";
                    break;
                case "바위" :
                    result = player[0]+"(이)가 이겼습니다";
                    break;
                case "보" :
                    result = "비겼습니다";
                    break;

            }
        }

    }
}