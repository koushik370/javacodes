class A{
    public void show(){
        System.out.println("A is called");
    }
}
class B extends A{
    public void show(){
        System.out.println("B is called");
    }
}
class C extends A{
    public void show(){
        System.out.println("C is called");
    }
}



public class runtimepoly {
    public static void main(String[] args) {
        A obj=new A();  //Dynamic dispatching in polymorphism..
        obj.show();
        obj=new C() ;
        obj.show();
        
    }
}
