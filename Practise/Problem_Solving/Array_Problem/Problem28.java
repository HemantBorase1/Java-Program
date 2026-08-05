class Problem28
{

     public static void main(String[] args)
     {
         int arr[]={1, 2, 3, 2, 4, 5, 6};
         int current=1;
         int maxlen=1;
         for(int i=1;i<arr.length;i++)
         {
              if(arr[i]>arr[i-1])
              {current++;}
              else{
                   current=1;
              }
             if(current>maxlen){
                maxlen=current;
            }
         }
         System.out.println(maxlen);
     }
}