class Program27{

    public static void main(String [] args)
    {
         int n=5; 
         int count=n; //5
         for(int i=1;i<=n;i++) 
          {
           int c= count; // 
             for(int j=5;j>=i;j--) // 
             {
              System.out.print(c+"\t"); // 
              c+=j-1;  
             }	
           System.out.println();
           count--; 
          }
    }
}
/*
Output:
5 9 12 14 15
4 
*/