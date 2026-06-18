class Problem3
{

    public static void main(String[] args)
    {
          int arr[]={23,4,7,8,9,1,7};
          int min=arr[0];
          for(int i=0;i<arr.length;i++)
          {
                 if(arr[i]<min)
                 {
                     min=arr[i];
                 }
          }
         System.out.println("Min Element in the Array:"+min);
    }
}