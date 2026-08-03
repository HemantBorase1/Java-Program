class Problem26
{
 
       public static Boolean isPalindrome(String str)
       {
           String rev="";  
            for(int i=str.length()-1;i>=0;i--)
            {
                  rev+=str.charAt(i);
            }
       
            return rev.equals(str);
       }
       public static void main(String[] args)
       {
             String str="madam java level racecar code";
             String words[]=str.split(" ");
            
             String found="";
             int max=0;
             for(int i=0;i<words.length;i++)
             {
                  String word=words[i];
                  if(isPalindrome(word))
                  {
                       if(word.length()>max){
                           max=word.length();
                           found=word;
                       }  
                  }
             }
             System.out.println(found);
       }
}