import java.util.Set;
import java.util.HashSet;
class Program8
{

    public static void main(String[] args)
    {
          Set<Object> st=new HashSet<>();

          st.add(null);
          st.add(null);
         st.add(10.12);
          st.add(true);
        System.out.println(st);
    }
}