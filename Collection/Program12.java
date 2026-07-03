import java.util.concurrent.SynchronousQueue;
class Program12
{

     public static void main(String[] args)
     {
         SynchronousQueue<String> queue = new SynchronousQueue<>();
         queue.add("Java");
         System.out.println(queue);
     }
}