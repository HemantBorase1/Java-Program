import java.util.Stack;

class Program5
{

    public static void main(String[] args)
    {
        Stack<Object> st=new Stack<>();
        st.push("Java");
        st.push(10);
        st.push(true);
        st.push("Artificial Intelligence");
        st.push(101.23);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.search("Java"));
        System.out.println(st.size());
        System.out.println(st.contains("Java"));
        st.clear();
        System.out.println("After Using Clear Method:"+st);
    }
}