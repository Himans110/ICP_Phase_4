package Stack_ICP;

public class Stack_Client {
    public static void main(String[] args) throws Exception{
        Stack st = new Stack(5);
        int r = (int)st.pop();
        System.out.println(r);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        int p = (int)st.pop();
        System.out.println(p);
        System.out.println(st.isEmpty());
        int q = (int)st.pop();
        System.out.println(q);
    }
}
