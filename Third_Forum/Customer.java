package Forum.Third_Forum;

public class Customer{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f , String l,Account account){
        firstName = f;
        lastName = l;
        this.account = account;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Account getAccount(){
        return account;
    }
}
