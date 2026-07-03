class Problem23
{

     public static void main(String[] args)
     {
           int arr[]={-5, 12, -3, 8, 10};
           int sum=0;
          
           for(int i=0;i<arr.length;i++)
           {
                if(arr[i]>0)
                {
                    sum+=arr[i];
                }
           }
          System.out.println(sum);
     }
}