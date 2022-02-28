public class Pro3_64011204 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20, 3, "red", true);
        Rectangle rectangle2 = new Rectangle(20, 3, "yellow", true);
        Rectangle rectangle3 = new Rectangle(22, 3, "red", true);

        System.out.println("Rectangle1 = "+rectangle1.getArea());
        System.out.println("Rectangle2 = "+rectangle2.getArea());
        System.out.println("Rectangle3 = "+rectangle3.getArea());

        System.out.println("Rectangle 1 is "+(rectangle1.equals(rectangle2) ? "" : "not ") + "equal Rectangle 2.");
        System.out.println("Rectangle 2 is "+(rectangle2.equals(rectangle3) ? "" : "not ") + "equal Rectangle 3.");
    }
}
