public class buffer{
    public static void main(String[] args) {
        StringBuffer name=new StringBuffer("koushik");
        name.append(" reddy");
        name.insert(0, "hello ");
        name.delete(0,5);
        System.out.println(name);

    }
}