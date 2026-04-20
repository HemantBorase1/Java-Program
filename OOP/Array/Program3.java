import java.util.*;
class Program3
{
  
   public static void main(String[] args)
   {
        // Comment One Code from the Above For Accurate Output
         int a[]={10,20,30,40,50};
         int temp=a[0];
        // for(int i=1;i<a.length;i++)
        //       a[i-1]=a[i];
       //  a[a.length-1]=temp;
      
         System.out.println(Arrays.toString(a));

        System.out.println("------------------------------------");
        System.out.println("Shift First Element to Last & Last to First");
        int temp1=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp1;
        System.out.println(Arrays.toString(a));
   }
}