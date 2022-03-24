package Forum.FIRST_EXERCISE;
import java.lang.Math;
import java.util.Scanner; 

public class NUMBER14 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int second;
        int minute;
        int hour;
        int secondnow;

        String secondwrite;String minutewrite; String hourwrite;


        System.out.println("Enter the number of seconds: ");
        second = myObj.nextInt();
        hour = second/3600;
        minute = (second - (hour*3600))/60;
        secondnow = (second - (hour*3600) - (minute*60));

        if (secondnow == 1){
            secondwrite = " second";
        }else {
            secondwrite = " seconds";
        }

        if (minute == 1){
            minutewrite = " minute ";
        }else {
            minutewrite = " minutes ";
        }

        if (hour == 1){
            hourwrite = " hour ";
        }else {
            hourwrite = " hours ";
        }
        
        System.out.println("So, " + second + " seconds are " + hour + hourwrite + minute + minutewrite + secondnow + secondwrite );
    }
}
