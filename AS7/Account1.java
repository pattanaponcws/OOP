import java.util.Date;

public class Account1 {
    public int id;
    public double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account1(){
        id=0;
        balance =0;
        annualInterestRate=0;
    }
    public Account1(int newId, double newBalance) {

        this.id = newId;
        this.balance = newBalance;
        dateCreated = new Date();
        annualInterestRate=0;
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

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newInterestRate) {

        this.annualInterestRate = newInterestRate;
    }

    public Date getDateCreated() {

        Date startDate = dateCreated;

        return startDate;
    }

    public double getMonthlyInterestRate() {

        double InterestRatePerMonth = (annualInterestRate / 12);

        return InterestRatePerMonth;
    }

    public double getMonthlyInterest() {

        double monthlyInterest = balance * (this.getMonthlyInterestRate() / 100);

        return monthlyInterest;
    }

    public void withdraw(double amount) {

        balance -= amount;
    }

    public void deposit(double amountDeposit) {

        balance += amountDeposit;

    }

    public String toString(){
        return "Checking Account\n"+"Overdraft limit : 5000\n"+"Balance is "+
        this.balance+"\nWithdraw : "
        ;
    }
}
