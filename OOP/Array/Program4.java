class Program4
{

  public static void main(String[] args)
  {
     int oddsum=0,evensum=0,count=0;
     int a[]={1,3,7,24,51,67,90};
     for(int i=0;i<a.length;i++)
     {
            if(a[i]%2!=0)
            {
               oddsum+=a[i];
               count++;
            }
           else
           {
               evensum+=a[i];
           }
     }
    int oddavg=oddsum/count;
    int evenavg=evensum/(a.length-count);
    System.out.println("Odd Average:"+oddavg);
    System.out.println("Even Average:"+evenavg);
  }
}