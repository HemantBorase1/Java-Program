class Problem22
{

    public static void main(String[] args)
    {
           String str="India is a amazing place";
           String word[]=str.split(" ");
           int count=0;
           for(int i=0;i<word.length;i++)
           {
                String words=word[i];
                char c=words.charAt(words.length()-1);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                     count++;
                
           }
         System.out.println(count);
    }
}