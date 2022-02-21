import java.util.ArrayList;
import java.util.Date;

public class Account2 {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();;
    public Account2(){
        id=0;
        balance =0;
        annualInterestRate=0;
        transactions = new ArrayList<>();
    }
    public Account2(int newId, double newBalance) {
       this.id = newId;
        this.balance = newBalance;
        dateCreated = new Date();
        annualInterestRate=0;
        transactions = new ArrayList<>();
    }
    public Account2(String name,int newId, double newBalance) {
        this.name = name;
        this.id = newId;
        this.balance = newBalance;
        dateCreated = new Date();
        annualInterestRate=0;
        transactions = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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

        return this.dateCreated;
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
        Transaction transaction = new Transaction(Transaction.WITH_DRAW, amount, this.balance, " ");
        transactions.add(transaction);
    }

    public void deposit(double amountDeposit) {

        balance += amountDeposit;
        Transaction transaction = new Transaction(Transaction.DEPOSIT, amountDeposit, this.balance, " ");
        transactions.add(transaction);
    }

    public ArrayList<Transaction> getTransaction(){
        return transactions;
    }

}
