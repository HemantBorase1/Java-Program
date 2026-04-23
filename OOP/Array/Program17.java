class Program17
{
 
  \\ Insertion Sort
   public static void main(String[] args)
   {
         int a[]={1,0,4,7,2,8};

         for(int i=1;i<a.length;i++)
         {
            int current=a[i];
            int j=i-1;
            while(j>=0&&a[j]>current)
            {
                  a[j+1]=a[j];
                  j--;
            }
           a[j+1]=current;
         }
     System.out.println(java.util.Arrays.toString(a));
   }
}

/*
1,0,4,7,2,8
0 1 2 3 4 5
        i
        c
  j
0,1,4,7,2,8
0 1 2 3 4 5
      i  
      c
    j

*/
