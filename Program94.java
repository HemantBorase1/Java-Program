class Program94
{
      public static void main(String[] args)
      {
         
 int n=5;
      
 for(int i=1;i<=n;i++)  // 2<=5
   {
         
         for(int j=i;j>1;j--) // 2>1

        {
    
           System.out.print(" ");

        }

           for(int j=i;j<=(((n-i+1)*2)-1);j++)  // 9<=7

           {

               System.out.print("*");

           }
        
       System.out.println();
  }

      }

}

/*
Error File Solve latter:

*********
 ******
  ***

*/