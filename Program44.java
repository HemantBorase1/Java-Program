class Program44{

public static void main(String [] args)
{ 
    int n=5;
    int count=1;
   for(int i=1;i<=n;i++) // 1<=5
   { 
       int c=count; // 1
        for(int j=i;j>1;j--) // 1>1
        {
         System.out.print("\t");
        }
        for(int j=n;j>=i;j--) // 2 >1 
        {
         System.out.print(c+"\t"); // 1 
        c+=j; // 1+5=6 6+4=10 10+3=13 13+2=15 
        }
     System.out.println();
     count++; 
   }
}

}