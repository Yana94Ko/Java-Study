package homework.day05;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DatePr {
    public static void main(String[] args) {
        Date nowDate = new Date();
        System.out.println("지정 전 : "+nowDate);

        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
        String strNowDate = simpleDateFormat.format(nowDate);

        System.out.println("지정 후 : "+ strNowDate);

    }
}
