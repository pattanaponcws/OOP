public class Pro4_64011204 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon oct1 = new Octagon(5);
        System.out.println("Octagon1\n"+oct1.toString());
        Octagon oct2 = (Octagon)oct1.clone();

      
        System.out.println("Octagon2\n"+oct2.toString());

        System.out.println("Compare oct1 and oct2 : "+oct1.compareTo(oct2));
    }
}
