package Forum.Third_Forum;
import java.util.LinkedList;
import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int operator;
        operator = 0;
        boolean cek_deposit;
        boolean cek_withdraw;
        int pick_currency;
        int currency_amount;
        int currency_price;

        double cash = 10000000;
        
        double deposit;
        

        System.out.println("The name of the bank:");
        String nama_bank = myObj.next();

        System.out.println("Your first name:");
        String nama_depan = myObj.next();

        System.out.println("Your last name:");
        String nama_belakang = myObj.next();

        System.out.println('\n');

        Bank bankjago = new Bank(nama_bank,new Customer(nama_depan, nama_belakang, new Account(2000000)));
        bankjago.CallOutBankName();

        bankjago.addCustomer(bankjago.takeCustomer().getFirstName(),bankjago.takeCustomer().getLastName());

        System.out.println("Bank " + bankjago.GiveBankName() + " has " + bankjago.getNumOfCustomers() + " customers/customer");
        
        System.out.println(' ');
        System.out.println("You got 2 million transfered to your bank account from your payday");
        System.out.println("Right now you have 10 million cash and 2 million in your bank");

        System.out.println("-----------------------------------");
        System.out.println(' ');

        // im sorry i dont use looping on this one. kinda lazy and sleepy, but im really sorry sir no kidding
        while (operator < 5){
            System.out.println("Input (1) if you want to deposit your money to the bank\nInput (2) if you want to withdraw your money\nInput (3) if you want to invest your money in binomo\nInput (4) if you want to do international currency exchange\nInput (5) if you want to quit this machine");
            
            operator = myObj.nextInt();

            if(operator == 1){
                System.out.println("Enter amount of money that you want to deposit: ");
                deposit = myObj.nextDouble();
                
                cash = cash - deposit;
                bankjago.takeCustomer().getAccount().changemoneydeposit(deposit);

                System.out.println("Now your cash is " + cash);
                System.out.println("And your balance in the bank is " + bankjago.takeCustomer().getAccount().getBalance());
                System.out.println(' ');
            }
            else if(operator == 2){
                System.out.println("Enter amount of money that you want to withdraw: ");
                deposit = myObj.nextDouble();
                
                cash = cash + deposit;
                bankjago.takeCustomer().getAccount().changemoneywithdraw(deposit);

                System.out.println("Now your cash is " + cash);
                System.out.println("And your balance in the bank is " + bankjago.takeCustomer().getAccount().getBalance());
                System.out.println(' ');
            }
            else if (operator == 3){
                System.out.println("RIP ALL YOUR MONEY GONE NOW");
                break;
            }
            else if (operator == 4 ){
                for (int i = 1 ; i < bankjago.international_currency.length + 1;i++){
                    System.out.println("("+i+")" + bankjago.international_currency[i-1] + " = " + bankjago.international_currency_value[i-1]);
                }
                System.out.println("Enter the currency:");
                pick_currency = myObj.nextInt();
                if (pick_currency == 1){
                    System.out.println("Enter the amount of " + bankjago.international_currency[0] + " you want to buy:");
                    currency_amount = myObj.nextInt();
                    currency_price = currency_amount*bankjago.international_currency_value[0];
                    System.out.println(currency_price);
                    
                    if (currency_price < bankjago.takeCustomer().getAccount().getBalance()){
                        bankjago.takeCustomer().getAccount().buycurrency(0, currency_amount, currency_price);
                    }else{
                        System.out.println("You don't have enough money, go deposit lah");
                    }
                }
                else if (pick_currency == 2){
                    System.out.println("Enter the amount of " + bankjago.international_currency[1] + " you want to buy:");
                    currency_amount = myObj.nextInt();
                    currency_price = currency_amount*bankjago.international_currency_value[1];
                    
                    if (currency_price < bankjago.takeCustomer().getAccount().getBalance()){
                        bankjago.takeCustomer().getAccount().buycurrency(1, currency_amount, currency_price);
                    }else{
                        System.out.println("You don't have enough money, go deposit lah");
                    }
                }
                else if (pick_currency == 3){
                    System.out.println("Enter the amount of " + bankjago.international_currency[2] + " you want to buy:");
                    currency_amount = myObj.nextInt();
                    currency_price = currency_amount*bankjago.international_currency_value[2];
                    
                    if (currency_price < bankjago.takeCustomer().getAccount().getBalance()){
                        bankjago.takeCustomer().getAccount().buycurrency(2, currency_amount, currency_price);
                    }else{
                        System.out.println("You don't have enough money, go deposit lah");
                    }
                }
                else if (pick_currency == 4){
                    System.out.println("Enter the amount of " + bankjago.international_currency[3] + " you want to buy:");
                    currency_amount = myObj.nextInt();
                    currency_price = currency_amount*bankjago.international_currency_value[3];
                    
                    if (currency_price < bankjago.takeCustomer().getAccount().getBalance()){
                        bankjago.takeCustomer().getAccount().buycurrency(3, currency_amount, currency_price);
                    }else{
                        System.out.println("You don't have enough money, go deposit lah");
                    }
                }
                else if (pick_currency == 5){
                    System.out.println("Enter the amount of " + bankjago.international_currency[4] + " you want to buy:");
                    currency_amount = myObj.nextInt();
                    currency_price = currency_amount*bankjago.international_currency_value[4];
                    
                    if (currency_price < bankjago.takeCustomer().getAccount().getBalance()){
                        bankjago.takeCustomer().getAccount().buycurrency(4, currency_amount, currency_price);
                    }else{
                        System.out.println("You don't have enough money, go deposit lah");
                    }
                }
                System.out.println("Your international currency now:");
                for (int i = 1 ; i < bankjago.international_currency.length + 1;i++){
                    System.out.println("("+i+")" + bankjago.international_currency[i-1] + " = " + bankjago.takeCustomer().getAccount().currency_amount[i-1]);
                }
                System.out.println("And your balance in the bank is " + bankjago.takeCustomer().getAccount().getBalance());
            }
        
        }
        System.out.println("BYE BYE");
    }
}
