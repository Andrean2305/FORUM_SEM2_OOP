package Forum.Third_Forum;

public class Account {
    private double balance;
    public double[] currency_amount = {0,0,0,0,0};

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amt){
        return (amt > 0);
    }

    public void changemoneydeposit(double amnt){
        if (deposit(amnt)){
            balance = balance + amnt;
        }else{
            System.out.println("You can't deposit a negative number");
        }
    }

    public boolean withdraw(double amt){
        return (amt < balance);
    }

    public void changemoneywithdraw(double amnt){
        if (deposit(amnt)){
            balance = balance - amnt;
        }else{
            System.out.println("You don't have enough money bro");
        }
    }

    public void buycurrency(int what_currency,int amount, int price){
        currency_amount[what_currency] = currency_amount[what_currency] + amount;
        balance = balance - price;
    }

}
