class Problem13
{

     public static void main(String[] args)
     {
          int [] arr={10,20,30,40,50};
          int sum=0;
          int len=arr.length;
          for(int i=0;i<arr.length;i++)
          {
             sum+=arr[i];
            
          }
          int avg=sum/len;
          int avgmax=arr[0];
          for(int i=0;i<arr.length;i++)
          {
                 if(arr[i]>avg)
                 {
                       avgmax+=arr[i];
                       break;
                 }
          }
        System.out.println("\t Average:"+avg+" Greater than Average: "+avgmax);
     }
}