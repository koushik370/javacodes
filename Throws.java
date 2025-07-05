class A{
    public void show() throws ClassNotFoundException
    {
        Class.forName("dlfj");
    }
}
public class Throws {
    public static void main(String[] args){
        A obj=new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        }
    
    }
    
}
