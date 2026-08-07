import java.util.Arrays;
class Problem31
{

     public static void main(String[] args)
     {
          int arr[]={100, 4, 200, 1, 3, 2};
          Arrays.sort(arr);
          System.out.print(arr[0]);
          for(int i=1;i<arr.length-1;i++)
          {
                if(arr[i]-arr[i-1]==1)
                {
                    System.out.print(","+arr[i]);
                }
                else
                    break;
           }
     
     }
}