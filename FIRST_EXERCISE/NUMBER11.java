package Forum.FIRST_EXERCISE;

import java.lang.Math;
import java.util.Scanner; 

public class NUMBER11 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int first;
        int second;
        int swapping;

        System.out.println("Enter the first number:"); 
        first = myObj.nextInt();

        System.out.println("Enter the second number:"); 
        second = myObj.nextInt();
        
        System.out.println("Your first number is " + first + " and your second number is " + second); 

        swapping = first;
        first = second;
        second = swapping;
        System.out.println("But now, your first number is " + first + " and your second number is " + second); 
        
    }
}
