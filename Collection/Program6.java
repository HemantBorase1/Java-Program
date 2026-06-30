import java.util.LinkedList;

class Program6
{

    public static void main(String[] args)
    {
         LinkedList<Object> ll=new LinkedList();
         
          ll.add("Java");
          ll.add(10.04);
          ll.add(true);
          ll.add(null);
        
          ll.addFirst('C');
          ll.addLast("Python");
          ll.removeFirst();
          System.out.println(ll);
    }
}