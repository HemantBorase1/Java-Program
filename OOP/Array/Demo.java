/*
 This Code File is Used for Only Dry Run & Demo Checking Code.

*/
import java.util.Arrays;
class Demo
{
     public static void main(String[] args)
     {
         int a[]={10,20,30,40};
         int b[]=new int[10];
         int len=a.length;
         for(int i=0;i<a.length;i++)
         {
            b[++len]=a[i];
         }
      System.out.println(Arrays.toString(b));
     }
}