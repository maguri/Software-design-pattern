package bank_OMG;

import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by R522 on 18/09/2015.
 */
public class UseBank {
    public static void main(String[] args) throws NotFound {

        //create Objects
        Bank bank = new Bank("OMG");
        Customer c1 = new Customer("name1","adress1","phoneNumber1");
        Customer c2 = new Customer("name2","adress2","phoneNumber2");
        Customer c3 = new Customer("name3","adress3","phoneNumber3");
        Customer c4 = new Customer("name4","adress4","phoneNumber4");
        List<Customer> cList = new LinkedList<>();
        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        cList.add(c4);

        Account a1 = new InvestFund(1999,c1);
        Account a2 = new BonusAccount(849,c2);
        Account a3 = new CheckingAccount(2943,c3);
        Account a4 = new SaveAccount(10012,c4);
        List<Account> aList = new LinkedList<>();
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);

        bank.setaList(aList);
        bank.setcList(cList);
        try {
            System.out.println("money of 'name4': " + bank.getAccount("name4").getMoney());
            System.out.println("money of 'notFound': " + bank.getAccount("error").getMoney());
        }
        catch (NotFound e){
            System.out.println("ERROR: "+e);
        }
        try{
            System.out.println(bank.getAccount("name1").monthlyRevision());
            System.out.println(bank.getAccount("name2").monthlyRevision());
            System.out.println(bank.getAccount("name3").monthlyRevision());
            System.out.println(bank.getAccount("name4").monthlyRevision());

           try{
               bank.getAccount("name1").withDraw(2000.0);
           }catch(IFException e){
               System.out.println("a1: "+e);
           }
            try{
                bank.getAccount("name2").withDraw(2000.9);
            }catch(IFException| NoMoneyException e){
                System.out.println("a2: "+e);
            }
           // try{

            //}
            //catch ()
            System.out.println(bank.getAccount("name3").withDraw(2000));

            System.out.println(bank.getAccount("name4").withDraw(450.0));

        }catch (NoMoneyException e){
            System.out.println(e);
        } catch (IFException e) {
            e.printStackTrace();
        }
//        Add a method to Bank enabling to show accounts ordered by name of the owner, or by money in their balance.


    }
}
