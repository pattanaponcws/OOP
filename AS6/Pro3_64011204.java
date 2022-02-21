public class Pro3_64011204 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i < 20; i++) {
            queue.enqueue(i+1);
            System.out.println("Enqueue("+ (i+1) +")"+" ");
        }
        queue.dequeue();
        while(!queue.empty()){
            System.out.print("\t"+queue.dequeue());
        }
        
    }
}
