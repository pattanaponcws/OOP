public class Pro2_64011204 {
    public static void main(String[] args) {
        Account2 test = new Account2("George",1122,1000);
        test.setAnnualInterestRate(1.65);

        test.deposit(30);
        test.deposit(40);
        test.deposit(50);

        test.withdraw(5);
        test.withdraw(4);
        test.withdraw(2);

        System.out.printf("%s%35s%17s%16s\n","Date","Type","Amount","Balance");
        for(Transaction tran: test.getTransaction()){
            System.out.printf("%-35s%-15c%-15.2f%.2f\n",tran.getTransactionDate(),tran.getType(),tran.getAmount(),tran.getBalance());
        }
    }
}
