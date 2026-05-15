class Program26
{
   public static void main(String[] args)
   {
         int a[]={10,20,30,40};
         int min=a[0];
         int max=a[0];
         int sum=0;
         int count=0;
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
            if(a[i]!=max&&a[i]!=min)
            {
                sum+=a[i];
                count++;
            }
            
         }
       int avg=sum/count;
         
       System.out.println("Maximum Value :"+max+"\t Minimum value:"+min);
       System.out.println("Average Element Except Min & Max"+avg);
    }
}