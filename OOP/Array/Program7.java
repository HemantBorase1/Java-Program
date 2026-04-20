import java.util.Arrays;
class Program7
{
     public static void main(String[] args)
     {
         int a[]={10,20,30,40};
         for(int i=1;i<a.length-1;i++)
         {
                a[i-1]=a[i];
                a[a.length-1]=a[0];
                
         }
         // Remaining to doing the Code.
       System.out.println(Arrays.toString(a));
     }
}