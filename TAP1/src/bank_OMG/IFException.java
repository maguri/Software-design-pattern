package bank_OMG;

/**
 * Created by R522 on 18/09/2015.
 */
public class IFException extends Exception{
    public IFException() {
        System.out.println("\tYour Account is an 'InvestFoundACCOUNT'\n\t Sorry, you can not withdraw your money");
    }
}
