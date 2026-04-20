import java.util.*;
class Program6
{
     public static void main(String [] args)
     {
           int a[]={10,20,30,40,50};
           System.out.println("Before Swap"+Arrays.toString(a));
           int first=a[0];
           int last=a[a.length-1];
           a[0]=last;
           a[a.length-1]=first;
           System.out.println("After Swap:"+Arrays.toString(a));
     }
}