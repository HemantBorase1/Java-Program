import java.util.Arrays;
class Program11
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50};
        for(int i=0;i<a.length/2;i++) // 2<2
        {
             a[i]+=a[a.length-1-i];
             a[a.length-1-i]=a[i]-a[a.length-1-i];
             a[i]-=a[a.length-1-i];
        }
      System.out.println(Arrays.toString(a));

    }
}

/*
[10,20,30,40,50]
  0  1  2  3  4
 60
              10
  50,20,30,40,10
   0  1  2  3  4
  50 60    20
  50 40 30 40 10
   0  1  2  3  4
*/