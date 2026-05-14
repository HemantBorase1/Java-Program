class Program32
{
    public static void main(String[] args)
    {
        String str = "w3resource";

        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < sb.length(); i++)
        {
            for(int j = i + 1; j < sb.length(); j++)
            {
                if(sb.charAt(i) == sb.charAt(j))
                {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }

        System.out.println(sb);
    }
}