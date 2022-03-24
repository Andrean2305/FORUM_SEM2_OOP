package Forum.SECOND_FORUM;
import java.util.Scanner;
import java.io.IOException;

public class PrintArrayInStars {
    public static void main(String[] args)throws IOException{
        Scanner myObj = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int number_of_items;
        String getvalue; 
    
        System.out.print("Enter the number of items: ");
        number_of_items = myObj.nextInt();
        // int[] all_values = new int [number_of_items];
        
        System.out.print("Enter the values of all items(seperated by space): ");
        int[] nums = new int[number_of_items];
    
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        };
    
        System.out.println("The values are: ");
    
        for (int i = 0; i < nums.length;i++){
            System.out.println(i + ": " + "*".repeat(nums[i]) + '(' + nums[i] + ')');
        }
    
        }
}
    

