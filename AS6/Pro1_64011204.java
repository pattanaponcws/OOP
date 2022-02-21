import java.util.Scanner;
public class Pro1_64011204{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Your name : ");
    String name = input.nextLine();
    System.out.print("Your age : ");
    int age = input.nextInt();
    System.out.print("Weight(pound) : ");
    double weight = input.nextDouble();
    System.out.print("Feet : ");
    double feet = input.nextDouble();
    System.out.print("Inches : ");
    double inches = input.nextDouble();
    System.out.println("-----------------------------------------");
    input.close();

    BMI bmi = new BMI(name,age,weight,feet,inches);
    System.out.println("Your name is "+bmi.getName()+" , "+bmi.getAge()+" years old.\n"+"Your BMI is "+
    bmi.getBMI()+" = "+bmi.getBMIStatus());
    }
}