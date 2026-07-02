class Problem21
{

    public static void main(String[] args)
    {
       int arr[]={-5, 8, -2, 10, -7, 3};
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]<0)
           {
               count++;
           }   
        }
      System.out.println("Negative Number Count in the Array:"+count);
    }
}