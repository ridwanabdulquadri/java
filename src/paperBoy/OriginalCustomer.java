package paperBoy;

public class OriginalCustomer {
    private String firstName;
    private String lastName;
    private String myWallet;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMyWallet() {
        return myWallet;
    }

    public float getPayment(float bill) {
        if (myWallet != null) {
//            if (myWallet.getTotalMoney() > bill) ;
//            float payment;
//            theWallet.subtractMoney(payment);
//            return payment;
//        }

        }
        return bill;
    }
}
