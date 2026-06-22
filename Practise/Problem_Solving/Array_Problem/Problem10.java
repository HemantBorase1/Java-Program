class Problem10
{

  public static void main(String[] args)
  {
         int arr[]={7,9,10,2};
         Boolean b=false;
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]<arr[i+1])
             {
                  b=true;
             }
             else{
                 b=false;
             }       
         }
  }
}