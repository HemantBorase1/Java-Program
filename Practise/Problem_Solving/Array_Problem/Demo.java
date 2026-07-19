import java.util.Arrays;
class Demo
{

     public static void main(String[] args)
     {
         int arr[]={1,2,3};
         for(int i=0;i<arr.length;i++)
         {
              if(arr[i]==1)
              {
                  arr[i]+=arr[i+1];
                  arr[i+1]-=arr[i-1];
                  
              }
         }
         System.out.println(Arrays.toString(arr));
     }
}