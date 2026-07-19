import java.util.Arrays;
class Problem15
{

     public static void main(String[] args)
     {
           int arr[]={16, 17, 4, 3, 5, 2};
           int leader[]=new int[arr.length];
 
          for(int i=0;i<arr.length;i++)
          {
               boolean isLeader=true;
               for(int j=i+1;j<arr.length;j++)
               {
                     if(arr[j]>arr[i])
                     {
                         isLeader=false;
                         break;
                     }
               }
              if(isLeader)
              {
                     System.out.print(arr[i]+" ");
              }
          }
      }
}