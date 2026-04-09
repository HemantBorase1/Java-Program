class Demo5
{

 void m1(int n)
 {
   if(n==0)
      return;
   System.out.println(n);
    m1(n-1);
 }
 void m2(int n)
 {
     if(n==0)
        return;
     m1(n-1);
      System.out.println(n);
 }

}