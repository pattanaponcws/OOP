public class SavingsAccount extends Account1{
    SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }else{
            System.out.print("Not Enough Money");
        }
    }
    public String toString(){
        return "Savings Account" + super.toString();
    }


}
