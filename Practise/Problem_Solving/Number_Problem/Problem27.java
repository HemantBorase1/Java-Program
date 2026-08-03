class Problem27
{

      public static void main(String[] args)
      {
           int n=46;
           int rem=n%10; 
           if(rem<5)
           {
               System.out.println("Nearest Number:"+(n-rem));
           }else{
               System.out.println("Nearst Number:"+(n+(10-rem)));
          }
      }
}