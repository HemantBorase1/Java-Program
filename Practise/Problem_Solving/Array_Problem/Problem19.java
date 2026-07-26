class Problem19
{

     public static void main(String[] args)
     {
         int arr[]={7, 4, 9, 2, 4, 8, 9};
         int found=0;
         boolean status=false;
         for(int i=0;i<arr.length;i++)
         {
              int current=arr[i];
              int j=i+1;
              while(j<arr.length){
                    if(arr[i]==arr[j++])
                    {
                        status=true;
                        found=arr[i];
                        break;
                    }
              }
            if(status)
            { break; }
         }
        System.out.println(found);
     }
}