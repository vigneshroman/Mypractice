public class Customer{
    int customerId;
    String customerName;
    String password;
    Account account;


    public Customer(int customerId, String customerName, String password,Account account) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.account=account;
    }


    @Override
    public String toString() {
        return  "Customer  customerId=" + customerId + ", customerName=" + customerName
                + ", password=" + password +" Account = "+account;
    }

}