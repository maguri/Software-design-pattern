package bank_OMG;


import org.omg.CosNaming.NamingContextPackage.NotFound;

//import java.util.HashMap;
import java.util.*;

/**
 * Created by R522 on 18/09/2015.
 */
public class Bank {
    List<Account> aList;
    List<Customer> cList;
    //HashMap<String,Account> diccionary;
    String name;


    public Bank(String name) {
        aList = new LinkedList<>();
        cList = new LinkedList<>();
       // diccionary = new HashMap<>();
        this.name = name;
    }

    private void addCustomer(Customer c){
       if(!cList.contains(c)) cList.add(c);
    }

    public void addAccount(Account a){
        if(!aList.contains(a)){
            aList.add(a);
            addCustomer(a.getCustomer());
        }
    }

    public Account getAccount(String name) throws NotFound {

        for(int i =0;i<aList.size();i++ ){
            if(aList.get(i).getCustomer().getName().equalsIgnoreCase(name)){
                return aList.get(i);
            }
        }
        throw new NotFound();
    }
    public void setaList(List<Account> aList) {
        this.aList = aList;
    }

    public void setcList(List<Customer> cList) {
        this.cList = cList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getaList() {
        return aList;
    }

    public List<Customer> getcList() {
        return cList;
    }

    public String getName() {
        return name;
    }

    public int lottery(){
        Random r = new Random();
        return r.nextInt()%aList.size()-1; //No Exception if there are no Accounts
    }



    /*   public String toStringName(){
 /*
           Collections.sort(aList, new Comparator<Account>() {
               @Override
               public int compare(Account o1, Account o2) {
                   int i =0;
                   while(i<aList.size()) {
                       String s1 = aList.get(i).getCustomer().getName();
                       String s2 = aList.get(i).getCustomer().getName();

                       s1.compareTo(s2);
                   }
               }
           });
   return "";
       }
    */
    public String toStringMoney(){

    return "";
    }
}
