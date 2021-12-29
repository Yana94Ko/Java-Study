package 조건문;
public class ElseIfExam3 {
    public static void main(String[] args) {
        int userID = 1;
        int password = 1234;
        if (userID == 1) {
            if (password == 1234) {
                System.out.println("관리자로 로그인 하였습니다.");
            }
        } else if (userID == 2) {
            System.out.println("판매자로 로그인 하였습니다.");
        } else {
            System.out.println(("구매자로 로그인 하였습니다."));
        }
    }
}
