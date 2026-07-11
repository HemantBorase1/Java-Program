class Program2
{

      public static void main(String[] args){
             
           StringBuilder sb=new StringBuilder("Hello");
           sb.append("World");
           System.out.println(sb);  // Hello World
           StringBuilder sb2=new StringBuilder("Hello");
           System.out.println(sb==sb2);    // false
           System.out.println(sb.equals(sb2));  // false
 
         /*
             In Java StringBuilder == && .equals() methods Both are 
             Comparing Based on the References.
             So Both Object Address Are Different in Heap Area Memory.
             So Both Are False.
          */
     }
}