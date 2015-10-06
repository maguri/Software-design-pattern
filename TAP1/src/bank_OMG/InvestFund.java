package bank_OMG;

/**
 * Created by R522 on 18/09/2015.
 */
public class InvestFund extends Account {

    public InvestFund(double money, Customer customer) {
        super(money, customer);
        super.interestRate = 0.34;
    }

    public String withDraw(double m) throws IFException {
        throw new IFException();
    }
}
