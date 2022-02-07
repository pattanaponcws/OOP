import java.util.Scanner;
public class Pro4_64011204{
    public static void main(String[] args) {
        double weight,height;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        weight = sc.nextDouble();

        System.out.print("Enter height inm inches : ");
        height = sc.nextDouble();

        sc.close();

        weight *= 0.45359237; //Kilograms
        height *= 0.0254; //Meter 

        double BMI = weight/(height*height);
        System.out.println("BMI is "+BMI);
        
    }
}