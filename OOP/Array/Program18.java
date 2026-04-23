class Program18
{

   public static void main(String[] args)
   {
        int a[]={1,2,3,9,5};
        System.out.println(isSorted(a));
   }
  public static boolean isSorted(int a[])
  {
        boolean b=false;
        for(int i=0;i<a.length-1;i++)
            if(a[i]>a[i+1])
               b=true;
       return !b;
  }
}