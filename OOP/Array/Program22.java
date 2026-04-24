class Program22
{

    public static void main(String[] args)
    {
          int a[]={10,20,30};
          int b[]={11,22,33,44,55};
          int c[]=new int[a.length+b.length];
    
          if(a.length<=b.length)
          {
                for(int i=0;i<c.length;i++)
                {
                    if(a[i]<b[i])
                    {
                        c[i]=a[i];
                        c[i+1]=b[i];
                    }
                    else
                    {
                        c[i]=b[i];
                        c[i+1]=a[i];
                    }
                }
          }
    }
}