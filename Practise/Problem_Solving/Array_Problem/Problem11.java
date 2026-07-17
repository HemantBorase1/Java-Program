class Problem11
{

     public static void main(String[] args)
     {
           int arr[]={18, 5, 27, 12, 9};
           int min=Integer.MAX_VALUE;
           int secondmin=Integer.MAX_VALUE;
 
           for(int i=0;i<arr.length;i++)
           {
                if(arr[i]<min)
                {
                    secondmin=min;
                    min=arr[i];
                }
                else if(arr[i]>min && arr[i]<secondmin)
                {
                      secondmin=arr[i];
                }
           }
           System.out.println(" Min Value:"+min+"\n Second Min:"+secondmin);
     } 
}