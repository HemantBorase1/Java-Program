class Problem16
{

    public static void main(String[] args)
    {
            int arr[]={10,7,8,4,14};
            Boolean b=false;
            int found=12;
            for(int i=0;i<arr.length;i++)
            {
                 if(found==arr[i])
                 {
                     b=true;
                     break;
                 }
                
            }
           if(b)
           {
                 System.out.println("Element is Found");
           }
           else
           {
                   System.out.println("Element is Not Found");
           }
    }
}