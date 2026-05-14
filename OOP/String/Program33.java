class Program33
{
    public static void main(String[] args)
    {
        String str = "gibblegabbler";

        char c = ' ';

        for(int i = 0; i < str.length(); i++)
        {
            int count = 0;

            for(int j = 0; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }

            if(count == 1)
            {
                c = str.charAt(i);
                break;
            }
        }

        System.out.println("The First Non Repeated Character in String is: " + c);
    }
}