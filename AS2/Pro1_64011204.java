import java.util.Scanner;
public class Pro1_64011204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] day ={"Sunday","Monday","Tuesday","Wednesday","Thuesday","Friday","Saturday"};

        System.out.print("Enter today's day : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        int num2 = sc.nextInt();
        sc.close();
        int total = num1+num2;

        System.out.println("Today is "+ day[num1%7]+" and the future day is "+day[total%7]);
    }
}
