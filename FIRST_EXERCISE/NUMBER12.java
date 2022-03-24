package Forum.FIRST_EXERCISE;

import java.lang.Math;

public class NUMBER12 {
    public static void main(String[] args){
        int number;
        int square;
        int cube;

        System.out.println("number  square  cube");

        for (int i = 0 ; i < 11 ; i++) {
            number = i;
            square = (int)Math.pow(number, 2);
            cube = (int)Math.pow(number, 3);
            if (i>=10){
                System.out.println("   " + number + "   " + square + "     " + cube);
            }else if(i>=4){
                System.out.println("   " + number + "    " + square + "      " + cube);
            }else{
                System.out.println("   " + number + "    " + square + "       " + cube);
            }
          }

    }
}
