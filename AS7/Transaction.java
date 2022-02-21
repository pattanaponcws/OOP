import java.util.Date;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date transactionDate;


    static final char WITH_DRAW = 'W';
    static final char DEPOSIT = 'D';
    
    public Transaction(char type,double amount,double balance,String description){
        this.transactionDate = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getTransactionDate(){
        return transactionDate;
    }

    public Transaction setTransaction(Date transactionDate){
        this.transactionDate = transactionDate;
        return this;
    }

    public char getType(){
        return type;
    }

    public Transaction setType(char type){
        this.type = type;
        return this;
    }

    public double getAmount(){
        return amount;
    }

    public Transaction setAmount(double amount){
        this.amount = amount;
        return this;
    }

    public double getBalance(){
        return balance;
    }

    public Transaction setBalance(double balance){
        this.balance = balance;
        return this;
    }

    public String getDescription(){
        return description;        
    }

    public Transaction setDescription(String description){
        this.description = description;
        return this;
    }
    public void printTrans(){
        System.out.println(transactionDate+"\t"+type+"\t\t"+amount+"\t\t"+balance+"\n");
    }

    public String toString(){
        return
        transactionDate+"\t"+type+"\t\t"+amount+"\t\t"+balance+"\n";
    }


}
