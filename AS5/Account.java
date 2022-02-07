import java.util.Date;
public class Account{
    private int id =0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account(){
        dateCreated = new java.util.Date();
    }

    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public Date getdateCreated(){
        return dateCreated;
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / (12);
    }

    public double getMonthlyInterest(){
        return this.balance*this.getMonthlyInterestRate()/100;
    }

    public void withdraw(int value){
        this.balance -= value;
    }

    public void deposit(int value){
        this.balance += value;
    }


}