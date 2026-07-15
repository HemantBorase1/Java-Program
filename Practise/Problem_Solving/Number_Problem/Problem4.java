class Problem4
{

    public static void main(String[] args)
    {
          int n=7878782;
          int d=8;
          int count=0;
          while(n!=0)
          {
              int digit=n%10;
              if(digit==d)
              {
                   count++;
              }
             n/=10;
          }
          System.out.println(count);
    }
}