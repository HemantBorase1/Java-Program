import java.util.*;
class Program25
{

  public static void main(String [] args)
  {
         int a[]={1,2,3,4,5};
         
         int index_pos=2;
         int newValue=23;
         System.out.println("Original Array:"+Arrays.toString(a));

         for(int i=a.length-1;i>index_pos;i--)
         {
              a[i]=a[i-1];
         }
        
         a[index_pos]=newValue;
         System.out.println("New Arrays:"+Arrays.toString(a));
  }
}