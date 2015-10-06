package bank_OMG;

/**
 * Created by R522 on 18/09/2015.
 */
abstract class Account {

    protected double money;
    protected Customer customer;
    protected  double comision = 10.0;
    protected double interestRate;

    public Account(double money, Customer customer) {
        this.money = money;
        this.customer = customer;
    }

    public double getMoney() { //==check balance
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void depositMoney(double n){
        this.money = money + n;
    }

    public String withDraw(double m) throws IFException, NoMoneyException {

        if(m>this.money) throw new NoMoneyException();
            double aux = money;
            this.money = this.money - m;

return ("Money\n"+aux+"\nUpdated\t"+money);

    }

    public String monthlyRevision(){
        money = money+ money * interestRate - comision;
        return "<"+money+"="+money+"+"+money+"*"+interestRate+"-"+comision+">";
    }
}
