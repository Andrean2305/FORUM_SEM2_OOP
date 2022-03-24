package Forum.FIRST_EXERCISE;
import java.util.Scanner; 

public class NUMBER9 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        float Celcius;
        float Fahrenheit;
        String suhu;  //A variable to choose user want to input celcius or fahrenheit
        
        System.out.println("What temperature scales you use. Input 'F' for Fahrenheit and 'C' for Celcius");
        suhu = myObj.nextLine();
        
        if (suhu.equals("C")){ //I just experiment things // For the number 9 i actually just need to convert from celcius to fahrenheit
            System.out.println("Enter the tempeterature(celcius) :"); 
            Celcius = myObj.nextFloat();
            Fahrenheit = (9/5 * Celcius) + 32;
            System.out.println(Celcius + " Celcius degrees are " + Fahrenheit + " Fahrenheit degrees");
        }else{
            System.out.println("Enter the tempeterature(Fahrenheit) :"); 
            Fahrenheit = myObj.nextFloat();
            Celcius = 5 * (Fahrenheit - 32) / 9;
            System.out.println(Fahrenheit + " Fahrenheit degrees are " + Celcius + " Celcius degrees");
        } 
        
    }
}
