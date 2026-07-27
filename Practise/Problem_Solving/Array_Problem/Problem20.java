import java.util.Arrays;
class Problem20
{

     public static void main(String[] args)
     {
          int arr1[]={1,4,7};
          int arr2[]={2,3,8};
          int merge[]=new int[arr1.length+arr2.length];
          for(int i=0;i<merge.length;i++)
          {
               int j=0;
               while(arr1[j]<arr2[j])
               {
                  merge[i]=arr1[j];
               }
             merge[i]=arr2[j];
             j++;
          }
        System.out.println(Arrays.toString(merge));
     }
}