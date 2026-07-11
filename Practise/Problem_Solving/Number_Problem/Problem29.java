class Problem29
{

   public static void main(String[] args){
   
    int n=2025;
    int n2=n;
    int sum=0;
    int temp=n;
    while(n!=0){
         count++;
         n/=10;

     }
    if(count==2){
         while(n2!=0)
         {
             int digit=n2%10;
             sum+=digit;
             n/=10;
         }
     }else if(count==4){
          while(n2!=0)
         {
             int digit=n2%100
             sum+=digit;
             n/=100;
         }
        }
       else{
        System.out.println("This is Not Tech Number");
       }
      if(temp==sum){
          System.out.println("Tech Number");
      }
      else{
        System.out.println("Tech Number");
        }
   }
}