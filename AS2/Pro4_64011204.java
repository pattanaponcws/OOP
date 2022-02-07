
import java.util.Arrays;
import java.util.Scanner;
public class Pro4_64011204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = new String[3];
        System.out.print("Enter the first city : ");
        num[0] = sc.nextLine();
        System.out.print("Enter the second city : ");
        num[1] = sc.nextLine();
        System.out.print("Enter the third city : ");
        num[2] = sc.nextLine();
        sc.close();

        Arrays.sort(num);
        System.out.print("The three cities in alphabetical order are "+num[0]+num[1]+num[2]);
        
      

    }
}
