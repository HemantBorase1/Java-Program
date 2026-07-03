import java.util.concurrent.ArrayBlockingQueue;

class Program13 {

    public static void main(String[] args) throws InterruptedException {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        queue.put(10);
        queue.put(20);
        queue.put(30);

        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
    }
}