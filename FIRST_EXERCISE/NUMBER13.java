package Forum.FIRST_EXERCISE;
import java.lang.Math;
import java.util.Scanner; 
public class NUMBER13 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int a;
        int b;
        int c;
        double xa;
        double x;
        double x1;
        double hitung;
        double hitung1;
        String polynomial;

        System.out.println("Remember you need to input based on the pattern.Otherwise, it will give you an error."); 
        
        // polynomial = "2x^2 + 3x + 4 = 0"; // You can use this if you don't want to input

        System.out.println("Enter second grade polynomial [With the patter of (ax^2 + bx + c = 0)]:"); System.out.println("You can also do this pattern : (ax^2 + (-bx) + (-4) = 0) for negatives"); 
        polynomial = myObj.nextLine();
        String split[] = polynomial.split("[x ^+=()]+"); 

        // 4*a*c need to be higher than b^2       

        a = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[2]);
        c = Integer.parseInt(split[3]);

        if (a == 0){
            xa = (double)-c/b;
            System.out.println("So the value of x is " + xa );
        }else{
            hitung = Math.pow (b, 2) - (4*a*c);
            hitung1 = Math.sqrt(hitung);

            x = (-b + hitung1 )/2/a ;
            x1 = (-b - hitung1 )/2/a ;
            System.out.println("So the value of x is " + x + " or " + x1 );
        }
        //4*a*c need to be higher than b^2. If 4a*c < b^2 it will give a NaN. Also if a = 0 it will give NaN . So i add another statement so it will give the right answer
    }
}
