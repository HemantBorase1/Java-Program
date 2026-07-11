class Problem29{

    public static void main(String[] args){
        int arr[]={3,8,9,12,7};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
               if(arr[i]%3==0)
               {
                     sum+=arr[i];
               }
        }
      System.out.println(sum);
    }
}