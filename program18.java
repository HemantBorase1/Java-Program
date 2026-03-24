class program18{

public static void main(String [] args){
  
  for(int i=1;i<=5;i++)
    { 
          for(int j=1;j<=i;j++)
              {
                System.out.print(j);        
              }
         System.out.println();

     }
   System.out.println();

/*
12345
1234
123
12
1

*/

  for(int i=5;i>=1;i--)
   {
     for(int j=1;j<=i;j++)
      {
      System.out.print(j);
      }
    System.out.println();
   }
System.out.println();

/*

54321
4321
321
21
1

*/

   for(int i=5;i>=1;i--)
   {
     for(int j=i;j>=1;j--)
       {
        System.out.print(j);
       }
     System.out.println();
   }
 System.out.println();

/*
12345
2345
345
45
5
*/
   for(int i=1;i<=5;i++)
    {

      for(int j=i;j<=5;j++)
       {
        System.out.print(j);
       }
     System.out.println();
    }
   }

}