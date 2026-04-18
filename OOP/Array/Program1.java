import java.util.Arrays;
class Program1
{
   public static void main(String[] args)
   {
          int a[]=new int[5];
          for(int i=0;i<a.length;i++)
              System.out.println(a[i]);
          
          System.out.println("--------------------------------------");
          System.out.println("Copying an Array to Another One.");
          int b[]={10,20,30,40,50};
          
          int c[]=new int [a.length];
          for(int i=0;i<b.length;i++)
          {
                 c[i]=b[i];
                System.out.println(b[i]+"\t"+c[i]);
          }
         System.out.println(b==c);
         
         System.out.println("Copy Array Using the Arrays Method. ");
         int c2[]=Arrays.copyOf(b,5);
         System.out.println(Arrays.toString(c2));
         System.out.println("--------------------------------------");
 
         System.out.println("By Anonymous Way.");

         int length=new int[]{10,20,30}.length;
         System.out.println(length);
         
         int ans=new int[]{10,20,30,40}[3];
         System.out.println(ans);
         
   }
}