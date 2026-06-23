class Problem11
{

    public static void main(String[] args)
    {
          int arr[]={1,2,8,3,7,9,6};
          int evenCount=0;
          int oddCount=0;
    
          for(int i=0;i<arr.length;i++)
          {
                if(arr[i]%2==0)
                     evenCount++;
                else
                     oddCount++;
          }
       System.out.println("Even Number Count:"+evenCount);
       System.out.println("Odd Number Count:"+oddCount);
    }
}