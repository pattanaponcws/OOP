import java.util.Scanner;

public class Pro3_64011204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] day = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thuesday","Friday"};
        int h;
        System.out.print("Enter the day of the month : ");
        int q = sc.nextInt();
        System.out.print("Enter month : ");
        int m = sc.nextInt();
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if(m==1){
            m=13;
            year--;
        }
            
        if(m==2){
            m=14;
            year--;
        }
        
        sc.close();
        int j = year/100;
        int k = year%100;

        h = (q + (26*(m+1))/10 + k/4 + j/4 + 5*j) % 7;

        System.out.println(q+"/"+m+"/"+year+" is "+day[h]);
    }
}
