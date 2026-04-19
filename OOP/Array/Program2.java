import java.util.Scanner;
class Program2
{

      public static void main(String[] args)
      {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter Size of the Array:");
             int n=sc.nextInt();
             int arr[]=new int[n];
             System.out.println("Enter the Array Element:");
             for(int i=0;i<arr.length;i++)
             {
                  arr[i]=sc.nextInt();
             } 
             System.out.println("Array Elements:");
             for(int i=0;i<arr.length;i++)
             {
                System.out.print(arr[i]+"\t");
             }
             
      }
}