class Program24
{
     public static void main(String args[])
     {
       String s1="hello nayan where is nitin";
       String s2[]=s1.split(" ");
       StringBuilder sb=new StringBuilder();
      
       for(int i=0;i<s2.length;i++)
       {
         String temp=s2[i];
         String rev=new StringBuilder(temp).reverse().toString();
 
         if(temp.equalsIgnoreCase(rev))
         {
              sb.append(temp);
              sb.append(" ");
         }
       }
       sb.deleteCharAt(sb.length()-1);
       System.out.println(sb);

      }
}