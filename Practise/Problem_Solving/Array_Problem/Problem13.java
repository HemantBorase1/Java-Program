class Problem13
{

     public static void main(String [] args)
     {
            int arr[]={3, 7, 9, 12, 14, 18};
            int count=0;
            for(int i=0;i<arr.length;i++)
            {
                 if(arr[i]%3==0)
                 {
                     count++;
                 }
            }
           System.out.println(count);
     }
}