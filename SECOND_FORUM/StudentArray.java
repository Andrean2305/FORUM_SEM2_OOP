package Forum.SECOND_FORUM;
import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;

public class StudentArray {
    public static void main(String[] args)throws IOException{
        Scanner myObj = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int number_of_items;
        String getvalue; 
    
        System.out.print("Enter the number of students: ");
        number_of_items = myObj.nextInt();
        
        double[] all_values = new double [number_of_items];
        
        for (int i = 1; i < number_of_items + 1; i++) {
            System.out.print("Enter the number of student " + i + ": ");
            all_values[i-1] = myObj.nextInt();
        };
        
        double count = 0;
        for (int i = 0 ; i < number_of_items; i++) {
            count = count + all_values[i];
        };
        
        double average = count/number_of_items;
        
        System.out.printf("The average is: %.2f ",average);
        System.out.printf("\n");
        
        double small = all_values[0];;
        double larg = all_values[0];
        for (int i = 0; i < number_of_items;i++){
            if (small > all_values[i])
                small = all_values[i];
        }

        for (int i = 0; i < number_of_items;i++){
            if (larg < all_values[i])
                larg = all_values[i];
        }

        System.out.println("The minimum is: " + (int)small);
        System.out.println("The maximum is: " + (int)larg);
    }
}
        
