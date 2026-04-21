class Program9
{
    public static void main(String [] args)
    {
        int a[]={8,4,2,7,11,3,1,0,15};
        int target=11;
        int index=search(a,target);
        System.out.println(index); 
    }

    public static int search(int a[],int target)
    {
         for(int i=0;i<a.length;i++)
                  if(a[i]==target)
                       return i;
         return -1;
    }

}