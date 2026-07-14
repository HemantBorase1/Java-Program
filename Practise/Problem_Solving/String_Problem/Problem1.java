class Problem1
{

      public static void main(String[] args)
      {
           String str="Programming";
           String lowercase=str.toLowerCase();
           int count=0;
           for(int i=0;i<str.length();i++)
           {
                char c=lowercase.charAt(i);
                if(c!='a'&& c!='e'&& c!='i' && c!='o' && c!='u')
                {
                   count++;
                 }
           }
           System.out.println(count);
      }
}