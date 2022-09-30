package java_0930;

import java.util.Calendar;

public class SimpleMathUse {
    public static void main(String[] args) {

        /*
        오전 -> "Good Morning"
        오후 10시 이전 -> "Good Evening"
        그 이후 -> "Good Night"
         */

        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);


        if (hour < 12) {
            System.out.println("Good Morning");
        }
        else if (hour < 22) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }


    }

}
