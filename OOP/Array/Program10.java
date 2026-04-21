class Program10
{

     public static void main(String[] args)
     {
          int a[]={10,13,15,17,22};
          int target=22;
          int index=search(a,target);
          System.out.println(index);
     }

     public static int search(int a[],int target)
     {
           int start=0;
           int end=a.length-1;
           while(start<=end)
           { 
             int mid=start+(end-start)/2;
             if(target>a[mid])
                   start=mid+1;
             else if(target<a[mid])
                   end=mid-1;
             else
                 return mid;
           }
      return -1;
     }
}