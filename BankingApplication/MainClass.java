import java.util.*;
import java.io.*;
public class MainClass {

    static List<Customer> customerBase = new ArrayList<Customer>();

    public static void displayCustomers() {
        for (Customer c : customerBase) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader("C://Users//vignel//Desktop//java//BankingApplication//bankdb.txt"));

            String line = "";
            while ((line = br.readLine()) != null) {

                String[] data = line.split(" ");
                System.out.println(Arrays.toString(data));

                Account acct = new Account(Integer.parseInt(data[1]), Integer.parseInt(data[3]));
                Customer c = new Customer(Integer.parseInt(data[0]), data[2], data[4],acct);

                customerBase.add(c);

                // System.out.println(line);
              
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("BANKING APPLICATION");

        while (true) {
            System.out.println("Enter the choice :");
            System.out.println("1-> Add Customer");
            System.out.println("2->print customers");
            System.out.println("3->Authentication(Login):");
            System.out.println("4->Cash Deposit");
            System.out.println("5->Cash Withdrawl");
            System.out.println("6->Account Transfer");
            System.out.println("0->Exit");

            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the Customer Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter the Password :");
                    String password = sc.nextLine();

                    System.out.println("Retype(confirm) the password :");
                    String retypedPassword = sc.nextLine();

                    if (password.equals(retypedPassword))
                  
                        new AddCustomer().addNewCustomer(name, password);

                    break;
                }
                case 2: {
                    displayCustomers();
                    break;
                }
                case 3: {
                    System.out.println("Enter your username(customer name) :");
                    String username = sc.nextLine();

                    System.out.println("Enter your Password :");
                    String password = sc.nextLine();

                    boolean auth = CustomerAuth.authenticateCustomer(username, password);

                    if (!auth) {
                        System.out.println("Login Failed ... Please check your username & password.");
                        return;
                    } else {
                        System.out.println("Authentication Successfull!.");
                        System.out.println("Select the operation to perform");

                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter your Account number :");
                    int acctNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the amount to be deposited :");
                    int amount = sc.nextInt();

                    new BankTransactions().cashDeposit(acctNumber, amount);
                    break;
                }
                case 5: {
                    System.out.println("Enter the Amount to be withdrwan");
                    int amount = sc.nextInt();

                    System.out.println("Enter Acct. Number :");
                    int accountNumber = sc.nextInt();

                    try {
                       new BankTransactions().withDrawCash(accountNumber, amount);
                    } catch (MinimumBalanceException e) {
                        // e.printStackTrace();
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 6: {

                    System.out.println("Enter your account number : ");
                    int fromAcctNumber = sc.nextInt();
                    System.out.println("Enter the beneficiary's account number :");
                    int toAcctNumber = sc.nextInt();
                    System.out.println("Enter the amount :");
                    int amount = sc.nextInt();
                    try {
                        new BankTransactions().fundTransfer(fromAcctNumber, toAcctNumber, amount);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    

                    break;
                }
                case 0:{
                    System.out.println("Application Exited.");
                    System.exit(0);
                    break;
                }
            }
           
        }
    }

}
