import java.util.*;
class Demo
{
    public static void main(String[] args)
	{
	   System.out.println("Enter the Size of Array:");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   
	   int[] arr=new int[n];
	   System.out.println("Enter the Array Elements:");
	   int sum=1;
	   for(int i=0;i<=n-1;i++)
	   {
	      arr[i]=sc.nextInt();
	   }
	   for(int i=0;i<=n-1;i++)
	   {
		   sum*=Math.abs(arr[i]); // absolute Function is Used for Converting the Negative Value into Positive One.(TCS NQT Question)
	   }
	   System.out.println("\n Sum of Product of Array:"+sum);
	}
}



