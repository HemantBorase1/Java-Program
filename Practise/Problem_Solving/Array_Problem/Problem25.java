import java.util.Arrays;
class Problem25
{

     public static void main(String[] args)
     {
          int arr[]={5, 8, 1, 6, 3, 2};
          int newarr[]=new int[arr.length];
          int j=0;
          for(int i=0;i<arr.length;i++)
          {
               
               if(arr[i]%2==0)
               {
                   newarr[j++]=arr[i];
               }   
          } 
          for(int i=0;i<arr.length;i++)
          {
                if(arr[i]%2!=0)
                {
                    newarr[j++]=arr[i];
                }
          }
          System.out.println(Arrays.toString(newarr));
     }
}