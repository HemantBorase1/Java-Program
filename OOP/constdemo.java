class constdemo
{

   static int a,b;
   constdemo()
   {
       System.out.println("Default Constructor Called.");
       System.out.println("a="+a+"b="+b+"\n");
   }
   constdemo(int a,int b)
   {
         System.out.println("User - Defined Constructor Called.");
         System.out.println("a:"+a+"\t b:"+b);
   }
  
   {
      a=10;
      b=20;
   }
}