class Program19{

   public static void main(String [] args)

   {

/*
____*
___**
__***
_****
*****
*/
           for(int i=1;i<=5;i++)
           {
           
             for(int j=i;j<5;j++)
              {
                System.out.print("_");
              }
             for(int j=i;j>=1;j--)
              {
                System.out.print("*");
              }
            System.out.println();
           }
   
System.out.println();
/*
_ _ _ _5
_ _ _4 4
_ _3 3 3
_2 2 2 2
1 1 1 1 1

*/

          for(int i=5;i>=1;i--)   // 4>=1
          { 
             for(int j=i;j>1;j--)   // 1>1 
              {
                System.out.print("_");
               }
             for(int j=i;j<=5;j++)   // 5<=5
              { 
                System.out.print(i);
              }
          System.out.println();

           }

/*
Dry Run :
____5
___44
*/

 /*
 _ _ _ _ 1
 _ _ _ 1 2
 _ _ 1 2 3
 _ 1 2 3 4
 1 2 3 4 5
 
 */

     for(int i=1;i<=5;i++)      //3<=5
     {
         for(int j=i;j<5;j++)    //4<5 
         { 
           System.out.print("_");
         }
         for(int j=1;j<=i;j++)      //3<=3
         {
          System.out.print(j);
         }
       System.out.println();
     } 
/*
Dry Run
_ _ _ _ 1
_ _ _ 1 2
_ _ 1 2 3
*/
System.out.println();

    for(int i=5;i>=1;i--) // 3>=1
     {
         for(int j=i;j<5;j++) // 4>5
         {
          System.out.print("_");
         }
         for(int j=1;j<=i;j++) // 3<=3
         {
            System.out.print(j);
         }
       System.out.println();
     }

/*
Dry Run:
12345
_1234
__123

*/
   }

}