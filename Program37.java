class Program37{

public static void main(String[] args)
 {
     int n=5;
     int count=(n*(n-1))/2+1;   //7
     for(int i=n;i>=1;i--)   4>=1
     {
      int c=count;  //7
       for(int j=i;j>1;j--)  4>1
       {
        System.out.print("\t");
       }
       for(int j=i;j<=n;j++) //4<=5
       {
       System.out.print(c+"\t"); // 11
       c+=j+1;   
       }
     System.out.println();
     count-=i-1; 
     }
 } 

}