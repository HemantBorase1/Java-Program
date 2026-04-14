class Demo6
{
   int factorial(int n)
   {
           if(n<2)
                  return n;
           return factorial(n-1)+ factorial(n-2);
   }

}