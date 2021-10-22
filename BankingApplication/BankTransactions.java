import java.util.*;;

public class BankTransactions {
    
    static int transactionId = 1;

    public  void cashDeposit(int accountNumber, int amount) {

        Iterator<Customer> iter = MainClass.customerBase.iterator();
        Transaction t = null;
        while (iter.hasNext()) {

            Customer c = iter.next();

            if (c.account.accountNumber == accountNumber) {
                c.account.balance += amount;
                t = new Transaction(transactionId, "CashDeposit", amount, c.account.balance);
                c.account.transactions.add(t);
                transactionId++;
                break;
            }

        }
        System.out.println("Amount has been credited successfully :");
        System.out.println("Transaction " + t);
    }


    public  void withDrawCash(int acctNumber, int amount) throws MinimumBalanceException {

        Iterator<Customer> iter = MainClass.customerBase.iterator();
        Transaction t = null;

        while (iter.hasNext()) {

            Customer c = iter.next();

            if (c.account.accountNumber == acctNumber) {

                int remBal = c.account.balance - amount;

                if (remBal <= 1000) {
                    // System.out.println("Amount cant be withdrwan. Insufficient balance.(Min. Balance should be 1000");
                    throw new MinimumBalanceException("Amount cant be withdrwan. Insufficient funds.(Min. Balance should be 1000)");
                    
                } 

                c.account.balance -= amount;
                t = new Transaction(transactionId, "CashWithdrawl", amount, c.account.balance);
                transactionId++;
                c.account.transactions.add(t);
                break;
            }
           
        }
        System.out.println("Amount has been Withdrawn successfully :");
        System.out.println("Transaction :" + t);

    }


    public  void fundTransfer(int fromAccountNo, int toAccountNo, int amount) throws MinimumBalanceException {
        Iterator<Customer> iter = MainClass.customerBase.iterator();
        Transaction t = null;
      
        while (iter.hasNext()) {
            Customer c = iter.next();
            if (c.account.accountNumber == fromAccountNo) {
                int remBal = c.account.balance - amount;

                if (remBal <= 1000) {
                    throw new MinimumBalanceException("Amount cant be Transferred. Insufficient funds.(Min. Balance should be 1000)");
                } 
                c.account.balance -= amount;
                t=new Transaction(transactionId, "CashWithdraw(Fund Transfer)", amount, c.account.balance);
                c.account.transactions.add(t);
                transactionId++;
                break;
            }
        }
        System.out.println("Transfering funds.....!");
        System.out.println("Transaction Info :"+ t);

        while (iter.hasNext()) {
            Customer c = iter.next();
            if (c.account.accountNumber == toAccountNo) {
                c.account.balance += amount;
                t = new Transaction(transactionId, "CashDeposit", amount, c.account.balance);
                c.account.transactions.add(t);
                transactionId++;
                break;
            }
        }
            System.out.println("Fund Transfer Successfull..!");
            System.out.println("Transaction Info :"+ t);
    }

}
