import java.io.*;
public class AddCustomer {
    
    static int customerId = MainClass.customerBase.get(MainClass.customerBase.size()-1).customerId+1;
    static int accountNo = MainClass.customerBase.get(MainClass.customerBase.size()-1).account.accountNumber+11;

    public  void addNewCustomer(String name, String password) {

        // password encrypyion;
        String encryptedPassword = "";

        for (char ch : password.toCharArray()) {
            if (ch == 'z') {
                ch = 'a';
                encryptedPassword += ch;
            } else if (ch == 'Z') {
                ch = 'A';
                encryptedPassword += ch;
            } else if (ch == '9') {
                ch = '0';
                encryptedPassword += ch;
            } else {
                encryptedPassword += (char) (ch + 1);
            }
        }

        Account newAccount = new Account(accountNo, 10000);
        Customer newCustomer = new Customer(customerId , name, encryptedPassword,newAccount);
        MainClass.customerBase.add(newCustomer);

        customerId++;
        accountNo+=11;
        System.out.println("Added Customer :" + newCustomer);

        // write to file bank_db.txt;
        BufferedWriter writer;
        String line = newCustomer.customerId+" "+newCustomer.account.accountNumber+" "+newCustomer.customerName+ " " +newCustomer.account.balance+" " +newCustomer.password;
        try {
             writer = new BufferedWriter(new FileWriter("C://Users//vignel//Desktop//java//BankingApplication//bankdb.txt", true));
             writer.append(line);
             writer.newLine();
            writer.close();
        } catch (Exception e) {
        
            System.out.println(e.getMessage());
        }
    }

}
