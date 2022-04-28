package Forum.Third_Forum;
import java.util.LinkedList;
import java.util.Arrays;  

public class Bank {
    private LinkedList<String> customers = new LinkedList<String>();
    private int numberOfCustomers;
    private String bankName;

    private Customer customer;

    public String[] international_currency = {"Konoha","Japan","Australia Dollar","Poop Dollar","Good"};
    public int[] international_currency_value = {10500,150,10200,3000,30000};

    public Bank(String bname,Customer customer){
        this.bankName = bname;
        this.customer = customer;
    }

    public String GiveBankName(){
        return bankName;
    }

    public void CallOutBankName(){
        System.out.println("This is " + bankName + " Bank");
    }

    public void addCustomer(String f, String l){
        customers.add(f + l);
    }

    public int getNumOfCustomers(){
        return customers.size();
    }

    public String getCustomer(int index){
        return customers.get(index);
    }

    public Customer takeCustomer(){
        return customer;
    }

    public int[] exchangecurrency(int currency,int ammount){
        int[] arr = {};
        for (int i = 0; international_currency_value.length < 5; i++)
            arr[i] = international_currency_value[i];
        
        return arr;
    }

    private Object parseint(String string) {
        return null;
    }
}
