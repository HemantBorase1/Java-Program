class Program20{
 
    public static void main(String [] args) 
   {

        int n=1;
        int count=n;

       for(int i=5;i>=1;i--)
        {
            int c=count;
            for(int j=1;j<=i;j++)
                {
                  System.out.print(c+"\t");
                  c++;
                } 
            count+=i;
          System.out.println();
        }
   }
}