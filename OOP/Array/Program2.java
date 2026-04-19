import java.util.Scanner;
class Program2
{

      public static void main(String[] args)
      {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter Size of the Array:");
             int n=sc.nextInt();
             int arr[]=new int[n];
             for(int i=0;i<arr.length;i++)
             {
                  arr[i]=sc.nextInt();
             } 
             
      }
}