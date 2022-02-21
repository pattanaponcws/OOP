import java.util.Scanner;

public class Pro5_64011204 {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        System.out.println("Filint Status \n\t[0]-Single filer\n\t[1]-Married jointly or qualifying widow(er)\n\t[2]-Married separately\n\t[3]-Head of household");
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        int taxable = input.nextInt();
        input.close();
        Tax tax = new Tax(status, taxable);
        System.out.println(String.format("Tax is %f", tax.getTax()));
    }

}
