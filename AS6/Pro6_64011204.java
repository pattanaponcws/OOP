import java.util.Scanner;

public class Pro6_64011204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] atm = new Account[10];

        for(int i=0;i<10;i++){
            atm[i] = new Account(i,100.00);
        }

        for(;; ){
            System.out.print("Please enter the Id : ");
            int idATM = input.nextInt();
            while(idATM <0 | idATM >9){
                System.out.println("Incorrect");
                idATM = input.nextInt();
            }

            int userInput =0;
            while(userInput != 4){
                System.out.println("Main Menu");
                System.out.println("1: Check Balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Enter a choice now:");

                userInput = input.nextInt();
                executeCommand(userInput, idATM, input, atm);
                System.out.println(" ");
            }
        }
    }

    public static void executeCommand(int userInput,int idATM,Scanner j,Account[] acc){
        switch (userInput) {

            case 1:
                System.out.printf("The balance in account " + idATM + " is $%.2f \n",
                        acc[idATM].getBalance());
                break;

            case 2:
                System.out.print("Enter the amount you want to withdraw:");
                acc[idATM].withdraw(j.nextDouble());
                break;

            case 3:
                System.out.print("Enter the amount you you want to deposit:");
                acc[idATM].deposit(j.nextDouble());
        }

    }
}
