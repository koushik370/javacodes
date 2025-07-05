class A{
    public A(){
        super();
        System.out.println("A is class");
    }
    public A(int n){
        super();
        System.out.println("A int n");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("B is  class");
    }
    public B(int n){
        this();
        System.out.println("B int n");
    }

}


public class super1 {
     public static void main(String[] args) {
        
        B obj=new B(5);
     }
}