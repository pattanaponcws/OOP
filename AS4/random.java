import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        System.out.println("Lottery");
        System.out.println(x);
    }
}
