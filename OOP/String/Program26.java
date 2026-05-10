class Program26
{

   public static void main(String args[])
   {
     StringBuilder sb=new StringBuilder();
     int count=10;
     for(int i=0;i<=2;i++)
     {
           if(count==10)
              sb.append(--count);
           else
               sb.append("a");
     }
    System.out.println(sb);
   }
}