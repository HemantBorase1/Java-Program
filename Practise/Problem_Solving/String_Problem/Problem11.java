class Problem11
{

     public static void main(String[] args)
     { 
              String str="I love Java Programming";
              String words[]=str.split(" ");
              int min=0;
           
              for(int i=0;i<words.length;i++)
              {
                   int current=words[i].length();
                   if(min>current)
                   {
                       min=i;
                   }
              }
              System.out.println(words[min]);
      }
}