class Program30{

public static void main(String[] args){
    
      int n=5;
      int count=n*(n+1)/2; //15
     for(int i=1;i<=n;i++)  // 1<=5
      {
        int c=count; // 15
          for(int j=i;j<=n;j++)  1<=5
           {
           System.out.print(c+"\t"); // 15 13 
           c-=j+1; // 10
           }
        System.out.println();
        count-=i;
      }
}

}