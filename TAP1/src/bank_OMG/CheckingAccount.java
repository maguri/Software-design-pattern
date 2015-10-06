package bank_OMG;

/**
 * Created by R522 on 18/09/2015.
 */
public class CheckingAccount extends Account{


    public CheckingAccount(double money, Customer customer) {
        super(money, customer);
        super.interestRate = 0.1;
    }

    public String monthlyRevision(){
        money = money+ money * interestRate; //no comision CA
        return "<"+money+"="+money+"+"+money+"*"+interestRate+"-"+comision+">";
    }
}
