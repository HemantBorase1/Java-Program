class Program5
{

     public static void main(String[] args)
     {
  
         String s1="India";

         StringBuilder sb=new StringBuilder(s1.substring(1));
         sb.append(s1.charAt(0));
         System.out.println(sb);          
/* 
          This is Another Way
          StringBuilder sb=new StringBuilder(s1);
           sb.append(sb.charAt(0));
           sb.deleteCharAt(0);
           System.out.println(sb);
*/
     }
}