import java.util.*;
class Program15
{
    
   public static void main(String[] args)
   {
        int n=6712315;
        int temp=n;
        int count=0;
       while(n!=0)
       {
         count++;
         n/=10;
       }
      int a[]=new int[count];
      for(int i=0;i<a.length;i++)
      {
            a[i]=temp%10;
            temp/=10;
      }
      Arrays.sort(a);
      int ans=0;
      for(int i=0;i<a.length;i++)
      {
            ans*=10;
            ans+=a[i];
      }
      System.out.println(Arrays.toString(a));
     System.out.println(ans);

   }

}