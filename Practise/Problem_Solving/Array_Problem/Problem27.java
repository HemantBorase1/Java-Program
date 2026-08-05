import java.util.Arrays;
class Problem27
{

     public static void main(String[] args)
     {
           int arr[]={4, 2, 4, 7, 2, 9, 7};
           int newarr[]=new int[arr.length];
            
           int size=0;
           for(int i=0;i<arr.length;i++)
           {
                isDuplicate=false;
                for(int j=i+1;j<arr.length;j++)
                {
                     if(arr[i]==arr[j])
                     {
                        isDuplicate=true;
                        break;
                     }
                }
              if(isDuplicate)
              {
                  newarr[size]=arr[i];
                  size++;
              }
           }
              
          System.out.println(Arrays.toString(newarr));
     }
}