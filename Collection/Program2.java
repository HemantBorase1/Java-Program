import java.util.ArrayList;
class Program2
{

    public static void main(String[] args)
    {
         ArrayList <Object> list=new ArrayList();
         list.add("Pratik");
         list.add(10);
         list.add('A');
         list.add(5.768);
  
         System.out.println(list);
        
         for(int i=0;i<list.size();i++)
              System.out.println(list.get(i));

         for(Object o:list)
             System.out.println(o);
         
    }
}