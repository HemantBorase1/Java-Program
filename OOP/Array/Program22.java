import java.util.Arrays;
class Program22
{

    public static void main(String[] args)
    {
          int a[]={10,20,30};
          int b[]={11,22,33,44,55};
          int c[]=new int[a.length+b.length];
    
          int index=(a.length*2)-1;
          int len=(a.length)-1;
          if(a.length<b.length)
          {
                
                for(int i=0;i<a.length;i++)
                {
                   
                    if(a[i]<b[i])
                    {
                        c[i+i]=a[i];
                        c[i+i+1]=b[i];
                        c[index++]=b[len++];  
                    }
                    else
                    {
                        c[i]=b[i];
                        c[i+1]=a[i];
                    }
                }
          }
          else
          {
                
          }
        System.out.println(Arrays.toString(c));
    }
}