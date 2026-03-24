class Program15{

 public static void main(String[] args){

   for(int i=5;i>=1;i--)
   {
      for(int j=5;j>=i;j--) 
       {
       System.out.print(j);
       } 
    System.out.println();
   }

System.out.println();

/*
A
BB
CCC
DDDD
EEEEE

*/

    for(int i=1;i<=5;i++)
    {

    for(int j=1;j<=i;j++) 
    {
         System.out.print((char)(i+64));
    }
     System.out.println();
    }
System.out.println();

/*
1
22
333
4444
55555
*/

for(int i=1;i<=5;i++)
{
   for(int j=1;j<=i;j++)
   {
   System.out.print(i);
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
for(int i=1;i<=5;i++)
{
   for(int j=1;j<=i;j++)
   {
   System.out.print(j);
    }
System.out.println();
 }

/*


*/
   
    }
}