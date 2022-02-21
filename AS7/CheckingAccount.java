public class CheckingAccount extends Account1{
    private double overdraftLimit;

    CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        System.out.format("%f\n", amount);
        if (amount - getBalance() <= this.overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.print("LIMIT\n");
        }
    }

    public String toString() {
        return super.toString();
    }
}