class Problem29
{

    public static void main(String[] args)
    {
       String str = "Java Full Stack Developer";
       int K = 4;
       int wordCount=0;
       String words[]=str.split(" ");
       
       for(int i=0;i<words.length;i++)
       {
           String word=words[i];
           int count=0;
           for(int j=0;j<word.length();j++)
           {
               count++;
           }
          if(count==K){
             wordCount++;
          }
       }
       System.out.println(wordCount);
    }
}