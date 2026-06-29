import java.util.ArrayList;
class Program1
{

    public static void main(String[] args)
    {
        ArrayList <Object> list=new ArrayList();
        list.add("Pratik");
        list.add("Hemant");
        list.add("Lala");
        list.add(34);
        System.out.println(list);
  
        String s1=list.get(0);
        System.out.println(s1);
 
        
    }
}