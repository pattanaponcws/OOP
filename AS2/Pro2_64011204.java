import java.util.Scanner;

public class Pro2_64011204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] game = {"scissor","rock","paper"};

        System.out.print("scissor (0), rock (1), paper (2): ");
        int num = sc.nextInt();
        sc.close();
        int computer = (int)(Math.random() * 3);

        System.out.print("The computer is "+ game[computer] +".You are "+game[num]);

        if(computer == 0){
            if(num == 0)
            System.out.print(" too.It is a draw.");
            else if(num==1)
            System.out.print(".You win.");
            else
            System.out.print(".You lose.");
        }

        else if(computer == 1){
            if(num == 0)
            System.out.print(".You lose.");
            else if(num==1)
            System.out.print(" too.It is a draw.");
            else
            System.out.print(".You win.");

        }
        else{
            if(num == 0)
            System.out.print(".You win.");
            else if(num==1)
            System.out.print(".You lose.");
            else
            System.out.print(" too.It is a draw.");

        }
        
    }
}
