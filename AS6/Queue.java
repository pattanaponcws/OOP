import java.util.Arrays;
public class Queue {
    int[] element;
    int size;
    public final int default_capacity =8;

    public Queue(){
        element = new int[default_capacity];
        size = 0;
    }

    public void enqueue(int v) {
        if((size+1) > element.length ){
            element = Arrays.copyOf(element, element.length *2);
        }
        element[size] = v;
        size++;
    }

    public int dequeue(){
        int res = -1;
        if (size > 0) {
            res = element[0];
            for (int i = 1; i < size; i++) {
                element[i - 1] = element[i];
            }
            size--;
        }
        return res;
    }

    public boolean empty(){
        if(size ==0)
            return true;
        else
            return false;
    }

    public int getSize(){
        return size;
    }

}
