class Program16{

   public static void main(String [] args){

/*
____*
___**
__***
_****
*****
*/
   int n=5;
    for(int i=1;i<=5;i++)
    {
       for(int j=i; j<n;j++)
       {
          System.out.print("_");
       }
       
       for(int j=i;j>=1;j--)
       {
         System.out.print("*");
       }
  System.out.println();
    }
     
   }

}

/*

i<=5 true
1<5 true
2<5 true
3<5 true
4<5 true

____*
___**

2<5
2<5 true
3<5 true
4<5 true
5<5 false

2>=1 true
1>=1 true
*/

