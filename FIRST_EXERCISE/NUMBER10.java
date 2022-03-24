package Forum.FIRST_EXERCISE;
import java.lang.Math;
import java.util.Scanner; 

public class NUMBER10 {
    static double[] number10abc(int x1,int x2,int x3){      //NUMBER 10 a) b) c)
      double μ;
      double σ;
      double σ2;

      μ = (x1 + x2 + x3)/3; // a)

      σ2 = (Math.pow((x1-μ), 2) + Math.pow((x2-μ), 2) + Math.pow((x3-μ), 2)); // b)

      σ = Math.sqrt(σ2); // c

      {
        double[] ans = new double[3];
        ans[0] = μ;
        ans[1] = σ2;
        ans[2] = σ;
  
        // returning array of elements
        return ans;
      } 
    }


    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int number1,number2,number3;
        float mean,variance,deviation;
        
        System.out.println("Please enter 3 interger numbers. The program will convert that to Mean , Variance , and Standard deviation"); 

        System.out.println("Enter the first number:"); 
        number1 = myObj.nextInt();

        System.out.println("Enter the second number:"); 
        number2 = myObj.nextInt();

        System.out.println("Enter the third number:"); 
        number3 = myObj.nextInt();

        double[] answer = number10abc(number1, number2, number3);
        System.out.println("The mean = " + answer[0]);
        System.out.println("The variance = " + answer[1]);
        System.out.println("The Standard deviation = " + answer[2]);
    }
}
