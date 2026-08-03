class Problem25
{

    public static void main(String[] args)
    {
           String str="Java is very powerful";
           String words[]=str.split(" ");
           int evenCount=0;
           for(int i=0;i<words.length;i++)
           {
                int count=0;
                String word=words[i];
                for(int j=0;j<word.length();j++)
                {
                     count++;
                }
                if(count%2==0)
                {
                     evenCount++;
                }
           }
           System.out.println(evenCount);
    }
}