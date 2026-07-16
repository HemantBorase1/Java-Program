class Problem4
{

    public static void main(String[] args)
    {
        int arr[]={12, 25, 40, 18, 25};
        int Target=18;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==Target)
          {
               index+=i;
          }
        }
       System.out.println(index);
    }
}