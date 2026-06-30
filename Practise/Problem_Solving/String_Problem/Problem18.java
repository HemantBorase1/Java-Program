class Problem18
{

    public static void main(String[] args)
    {
         String str="Programming";
         int count=0;
        // String check="aeiouAEIOU";
         for(int i=0;i<str.length();i++)
         {
                char c=str.charAt(i);
                if(c!='a'&& c!='e'&&c!='i'&&c!='o'&&c!='u'&& c!='A'&&c!='E'&&c!='O'&&c!='U')
                {
                     count++;
                 }
         }
         System.out.println("Consonants in a String:"+count);
    }
}