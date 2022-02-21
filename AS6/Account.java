public class Account {
    public int id;
    public double balance;
    public Account(int newId, double newBalance) {

        this.id = newId;
        this.balance = newBalance;
    }

    public int getID() {

        return id;
    }

    public void setID(int newID) {

        this.id = newID;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double newBalance) {

        this.balance = newBalance;
    }

    public void withdraw(double amount) {

        balance -= amount;
    }

    public void deposit(double amountDeposit) {

        balance += amountDeposit;

    }
}
