class Program21{

     public static void main(String [] args){
       
/*
54321
_5432
__543
___54
____5
*/
       for(int i=1;i<=5;i++)
        {
             for(int j=i;j>1;j--)
             {
              System.out.print("_");
              }

             for(int j=5;j>=i;j--)
             {
              System.out.print(j);
              }
        System.out.println();
        }
    
 System.out.println();

/*
    1
   12
  123
 1234
12345
*/

    for(int i=1;i<=5;i++)   // 1<=5
    {
          for(int j=i;j<5;j++)  // 1<5 -> 2<5 -> 3<5 -> 4<5 -> 5>5
          {
          System.out.print("_");
          }
          for(int j=1;j<=i;j++) // 1<=1 
          {
          System.out.print(j);
          }
     System.out.println();
     }
  }

}