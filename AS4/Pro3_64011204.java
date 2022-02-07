import java.util.Random;
import java.util.Arrays;
public class Pro3_64011204 {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();

        Random random = new Random();
        double[] number = new double[1000];
        for(int i=0;i<1000;i++){
            number[i] = random.nextDouble(1000);
        }
        
        System.out.println("Creating a list containing 1000 elements,");

        for(int i =0;i<1000;i++){
            if((i+1)%10 ==0){
                System.out.println(String.format("\t%.2f", number[i]));
            }
            else{
                System.out.print(String.format("\t%.2f", number[i]));
            }
            /////////////////////////////////////////////////////////
        }
        System.out.println("List created.\nSorting stopwatch starts...");
        time.start(); ///Sorting

        Arrays.sort(number);
        for(int i =0;i<1000;i++){
            if((i+1)%10 ==0){
                System.out.println(String.format("\t%.2f", number[i]));
            }
            else{
                System.out.print(String.format("\t%.2f", number[i]));
            }
            
        }

        time.end();
        System.out.println("The sort time is "+time.getElapsedTime()+" milliseconds");

        System.out.println("The palindromPrime stopwatch starts...\nCreating 1000 PalindromPrime...");

       time.start();
        for(int n=2,count =0;count < 1000;n++){
            if(isPalindrome(n) && isPrime(n)){
                System.out.print(n + "\t");
                    count++;
                if(count % 10 == 0)
                    System.out.println();
            
           }
       }
       time.end();
       System.out.println("The palindromPrime time is "+time.getElapsedTime()+" milliseconds");
    }

    public static boolean isPalindrome(int x){
        int temp =x;
        int r,sum=0;
        while(x >0){
            r = x%10;
            sum = (sum*10) + r; 
            x = x/10;
        }

        if(temp ==sum)
            return true;
        else
            return false;
    }

    public static boolean isPrime(int x){
        if(x <=1){
            return false;
        }
        for(int i=2;i<= x/2;i++){
            if(x%i ==0){
                return false;
            }
        }
        return true;
    }
}
