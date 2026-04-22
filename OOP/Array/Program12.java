import java.util.Arrays;
class Program12
{

   public static void main(String[] args)
   {
         int a[]={5,2,3,9,6,7,4};
        for(int i=0;i<a.length;i++)
             for(int j=i+1;j<a.length;j++)
                 if(a[i]>a[j])
                 {
                      int temp=a[i];
                      a[i]=a[j];
                      a[j]=temp;
                 }
      System.out.println(Arrays.toString(a));
   }
}

/*
Dry Run :
[5,2,3,9,6,7,4]
 0 1 2 3 4 5 6
 i  
   j
 if(5>2)
 temp=5
 a[0]=2
 a[1]=temp
 
[2,5,3,9,6,7,4]
 0 1 2 3 4 5 6
 i 
             j
[2,5,3,9,6,7,4]
 0 1 2 3 4 5 6 
   i
      j
  if(5>3)
   temp=5
   a[1]=3
   a[2]=temp

[2,3,5,9,6,7,4]
 0 1 2 3 4 5 6
   i
             j
[2,3,5,9,6,7,4]
 0 1 2 3 4 5 6
     i
             j
  if(5>4)
  temp=5
  a[2]=4
  a[j]=temp
 [2,3,4,9,6,7,5]
  0 1 2 3 4 5 6
 

*/