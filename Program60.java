class Program60{

public static void main(String  pd [])
{

   int n=5;
   int count=n;
   for(int i=n;i>=1;i--)
   {
    int c=count;
    for(int j=i;j>=1;j--)
     {
        System.out.print((char)(c+96)+"\t");
        c--;
     }
     System.out.println();
     count+=i-1;
   }

}

}