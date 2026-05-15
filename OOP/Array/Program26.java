class Program26
{
   public static void main(String[] args)
   {
         int a[]={10,20,30,40};
         int min=a[0];
         int max=a[0];
         for(int i=0;i<a.length;i++)
         {
              if(max<a[i])
              {
                  max=a[i];
              }
              if(min>a[i])
              {
                  min=a[i];
              }
            
         }
       System.out.println("Maximum Value :"+max+"\t Minimum value:"+min);
    }
}