class Program23{

     public static void main(String [] args)
     {
// Count is Used for Row
//  & C Var is Used for Coloumn

          int n=5;
          int count=n*(n+1)/2; // 5*6/2=15
          for(int i=n;i>=1;i--) // 5>=1 
            {
                   for(int j=i;j>=1;j--) // 4>=1 
                     {
                        System.out.print(count+"\t");
                      count--;
                     }
                System.out.println();
               //count+=i;
            }
     }

}