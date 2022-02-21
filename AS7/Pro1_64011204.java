public class Pro1_64011204{
    public static void main(String[] args) {
        Account1 account = new Account1(1, 5000);
        SavingsAccount savingsAccount = new SavingsAccount(2, 5000);
        CheckingAccount checkingAccount = new CheckingAccount(3, 5000, 5000);
        account.withdraw(1000);
        savingsAccount.deposit(1000);       
        System.out.print(checkingAccount.toString());
        checkingAccount.withdraw(10000);
        System.out.format("Balance is %f\n", checkingAccount.getBalance());
        System.out.print("This account was created at " + checkingAccount.getDateCreated());
    }
}