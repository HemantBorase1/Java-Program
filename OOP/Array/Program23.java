import java.util.Arrays;
class Program22
{
// Find Another Solution Well Optimized
    public static void main(String[] args)
    {
          int a[]={10,20,30,40};
          int b[]={11,22,33,44,55};
          int c[]=new int[a.length+b.length];    
          int index=(a.length*2)-1;
          if(a.length<b.length)
          {
                
                for(int i=0;i<a.length;i++)
                {
                        c[i]=a[i];
                        c[a.length+i]=b[i];  
                }
				for(int i=a.length;i<b.length;i++)
				{
				        c[a.length+i]=b[i];       	
                }
		  } else
                {
                     for(int i=0;i<b.length;i++)
					 {
						 c[i]=a[i];
						 c[a.length+i]=b[i];
					 }
					 for(int i=b.length;i<a.length;i++)
					 {
						 c[i]=a[i];
					 }
          }
        System.out.println(Arrays.toString(c));
    }
}