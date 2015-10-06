package bank_OMG;

/**
 * Created by R522 on 18/09/2015.
 */
public class BonusAccount extends Account{

    public BonusAccount(double money, Customer customer) {
        super(money, customer);
        super.interestRate = 0.6;
    }
}
