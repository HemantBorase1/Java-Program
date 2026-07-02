class Problem21
{

    public static void main(String[] args)
    {
        String str="JaVaProGram";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isLowerCase(c))
            {
                count++;
            }
        }
        System.out.println("LowerCase Character Count:"+count);
    }
}