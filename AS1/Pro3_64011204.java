import java.util.Scanner;

public class Pro3_64011204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 0 and 1000 : ");
        int number = sc.nextInt();
        int x,y,z,o;

        x =number/100;
        y= number/10; 
        o=y%10; 
        z=number%10;
        sc.close();

        int sum = x+o+z;
        System.out.println(sum);
        
    }
}
