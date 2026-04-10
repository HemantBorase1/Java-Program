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
 int sumOfNum(int n)
 {
     if(n<10)
        return n;
     return n%10+sumOfNum(n/10);
 }

int factorial(int n)
{
    if(n <= 1)
        return 1;
    return n * factorial(n - 1);
}

 

}