import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String arr1[] = {"Shibuya","Aya","Commander","Onisuka"};
        String arr2[] = {"Bangkok","Samyan"};

        String[] total = new String[arr1.length+arr2.length];

        System.arraycopy(arr1, 0, total, 0, arr1.length);
        System.arraycopy(arr2, 0, total, arr1.length, arr2.length);
        System.out.println(Arrays.toString(total)); //แสดงผลแบบ list
        Arrays.sort(total); //เรียงลำดับ
        System.out.println(Arrays.toString(total));
    }
}
