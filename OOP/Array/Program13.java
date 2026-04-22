// Bubble Sort
import java.util.Arrays;
class Program13
{
   public static void main(String[] args)
   {
         int a[]={6,2,4,8,3,9,7,1};
 
         for(int i=0;i<a.length;i++)
             for(int j=0;j<a.length-1;j++)
                  if(a[j]>a[j+1])
                   {
                       int temp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=temp;
                    }
    System.out.println(Arrays.toString(a));
   }
}