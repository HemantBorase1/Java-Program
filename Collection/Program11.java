import java.util.concurrent.SynchronousQueue;

public class Program11 {
    public static void main(String[] args) {

        SynchronousQueue<String> queue = new SynchronousQueue<>();

        // Producer
        new Thread(() -> {
            try {
                System.out.println("Producer: Sending Java");
                queue.put("Java"); // Waits until consumer receives it
                System.out.println("Producer: Sent");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Consumer
        new Thread(() -> {
            try {
                Thread.sleep(2000); // Delay to show producer waits
                System.out.println("Consumer: Received " + queue.take());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}