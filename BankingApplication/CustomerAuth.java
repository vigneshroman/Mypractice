public class CustomerAuth {
    
    public static boolean authenticateCustomer(String username, String password) {

        boolean auth = false;
        String decryptedPassword = "";

        for (Customer cust : MainClass.customerBase) {
            if (cust.customerName.equals(username)) {

                for (char ch : cust.password.toCharArray()) {
                    if (ch == 'a') {
                        ch = 'z';
                        decryptedPassword += ch;
                    } else if (ch == 'A') {
                        ch = 'Z';
                        decryptedPassword += ch;
                    } else if (ch == '0') {
                        ch = '9';
                        decryptedPassword += ch;
                    } else {
                        decryptedPassword += (char) (ch - 1);
                    }
                }
                break;
            }
        }

        if (decryptedPassword.equals(password))
            auth = true;

        return auth;
    }

}
