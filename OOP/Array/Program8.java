import java.util.*;
class Program8
{
    public static void main(String[] args)
    {
          int a[]={10,20,30,40,50};
          for(int i=a.length-2;i>=0;i--)
          {
                 a[i]+=a[i+1];
                 a[i+1]=a[i]-a[i+1];
                 a[i]-=a[i+1];
          }
      System.out.println(Arrays.toString(a));
    }
}

/*
10  20  30  40  50
0    1   2   3   4

Output:
[50, 10, 20, 30, 40]
*/
