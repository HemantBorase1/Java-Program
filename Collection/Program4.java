import java.util.Vector;
class Program4
{

    public static void main(String[] args)
    {
          Vector<Object> list=new Vector<>();
         
          list.add("Hello");
          list.add(null);
          list.add(23.17);
          list.add(null);
          list.add(2,"Pratik");
         System.out.println(list);
    }
}