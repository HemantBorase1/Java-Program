import java.util.*;
class Program20
{

    public static void main(String[] args)
    {

         int a[]={10,20,30};
         int b[]={11,22,33};
         int c[]=new int[a.length+b.length];
           int j=0;
         int index=0;
         for(int i=0;i<a.length;i++)
         {
              index=i;
              c[i]=a[i];
         }
         System.out.println(index);
         for(int i=index+1;i<c.length;i++)
         {
           
             c[i]=b[j++]; 
         }
        System.out.println(Arrays.toString(c));
         
     }
}