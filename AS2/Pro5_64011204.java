import java.util.Scanner;
public class Pro5_64011204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();
        for(int i=0;i<num;i++){
            System.out.print(" ".repeat((num-i-1)*2));
            for(int k=i;k>=-i;k--){
                System.out.print((Math.abs(k)+1)+" ");
            }
            System.out.println();
        }
    }
}
 