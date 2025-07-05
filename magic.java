 abstract class A{
    abstract void show();
    abstract void config();
}
public class magic{
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){ //anynomus inner class overrides the class and to create this class we doestnot require any object and class
                System.out.println("new class");
            }

            @Override
            void config() {
                System.out.println("config class");
            }
        };
        obj.show();
        obj.config();
        
    }
}