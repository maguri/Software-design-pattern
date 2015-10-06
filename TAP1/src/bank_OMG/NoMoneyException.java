package bank_OMG;

/**
 * Created by R522 on 18/09/2015.
 */
public class NoMoneyException extends Exception{
    public NoMoneyException() {
        System.out.println("There are not enought money in your Account! \n\t\t\t Sorry" );
    }
}
