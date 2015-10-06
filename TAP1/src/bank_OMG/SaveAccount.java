package bank_OMG;

/**
 * Created by R522 on 18/09/2015.
 */
public class SaveAccount extends Account{

    public SaveAccount(double money, Customer customer) {
        super(money, customer);
        super.interestRate = 0.2;
    }
}
