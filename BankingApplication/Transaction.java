public class Transaction {
    int transactionId;
    String transactionType;
    int amount;
    int balance;

    
    public Transaction(int transactionId, String transactionType, int amount, int balance) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "[transactionId=" + transactionId
                + ", transactionType=" + transactionType + ", amount=" + amount + ", balance=" + balance + "]";
    }

}
