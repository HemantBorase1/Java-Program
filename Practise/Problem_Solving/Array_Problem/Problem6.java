import java.util.Arrays;
class Problem6
{

    public static void main(String [] args)
    {
        
         int arr[]={4, 0, 2, 0, 8, 5, 0};
         
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]==0)
            {
               for(int j=i+1;j<arr.length;j++)
               {
                     if(arr[j]!=0)
                     {
                          int temp=arr[i];
                          arr[i]=arr[j];
                          arr[j]=temp;
                          break;
                     }
               }
            }
         }
         System.out.println(Arrays.toString(arr));
    }
}