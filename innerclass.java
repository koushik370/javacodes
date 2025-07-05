class A{
    public void show(){
        System.out.println("A class ");
    }
    class B{
        public void config(){
            System.out.println("B class");
        }
    }
}
public class innerclass{
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        A.B obj1=obj.new B(); // inner class
        obj1.config();
        
    }
}