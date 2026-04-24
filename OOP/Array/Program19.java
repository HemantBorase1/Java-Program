import java.util.Arrays;
class Program19
{

    public static void main(String[] args)
    {
           int a[]={1,7,9,10,3,4,2};
           int max=a[0];
           int temp=0;
           for(int i=0;i<a.length;i++)
           {
                if(a[i]>max)
                {
                 max=a[i];
                 temp=i;
                 }
              
           }
          for(int i=temp;i<a.length-1;i++)
          {
             int temp1=a[i];
             a[i]=a[i+1];
             a[i+1]=temp1;
          }
        System.out.println(Arrays.toString(a));
     }
}