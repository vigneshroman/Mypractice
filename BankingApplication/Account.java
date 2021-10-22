import java.util.ArrayList;

public class Account {

    int accountNumber;
    
    int balance;

    ArrayList<Transaction> transactions;
    
    public Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "accountNumber=" + accountNumber + ", balance=" + balance +" ,Transactions="+transactions;
    }

}
