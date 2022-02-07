import java.util.*;

public class Pro2_64011204{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for(int i=0;i<list1.length;i++){
            list1[i] = input.nextInt();
        }

        System.out.print("Enter lest2: ");
        int[] list2 = new int[input.nextInt()];
        for(int i=0;i<list2.length;i++){
            list2[i] = input.nextInt();
        }

        input.close();
        int l1 = list1.length;
        int l2 = list2.length;
        int[] total = new int[l1+l2];
        System.arraycopy(list1, 0, total, 0, l1); //ใส่ list1 เข้าไปใน total
        System.arraycopy(list2, 0, total, l1, l2); //ใส่ list2 เข้าไปใน total
        Arrays.sort(total);
        System.out.println("The merged list is "+Arrays.toString(total));


    }

 }
