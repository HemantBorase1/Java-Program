class Program66{

/*
54321
44321
33321
22221
11111
*/
public static void main(String[] args)
{
   int n=5;
  for(int i=n;i>=1;i--) // 5>=1
  {
     for(int j=5;j>=i;j--)  // 5 >=5
     {
        if(i<j) // 3<5             // 543
        {
         System.out.print(i);
         }    
       else
      {
       System.out.print(j);
      } 
  
     }
     
   System.out.println();
  }

}

}