package 배열;

public class StringEx01 {
    public static void main(String[] args) {
        String[] name = new String[3]; // 3개의 문자열을 담을 수 있는 배열을 생성한다.
        name[0] = "kim";
        name[1] = "park";
        name[2] = "yi";
        
        for(String str : name){
            System.out.println(str);
        }
    }
}
