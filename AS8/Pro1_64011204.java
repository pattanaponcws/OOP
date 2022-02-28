import java.util.Scanner;

public class Pro1_64011204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 side of triangle.");

        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        

        System.out.print("Enter your color : ");
        String color = input.next();
        System.out.print("if you want to fill ans true but you won't ans false : ");
        boolean fill = input.nextBoolean();
        Triangle tri = new Triangle(s1,s2,s3);
        input.close();

        tri.setColor(color);
        tri.setFilled(fill);

      System.out.println(tri.toString());

    }
}
