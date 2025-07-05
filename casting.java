class A{
    public void show1(){
        System.out.println("A class is called");
    }
    }
    class B extends A{
        public void show2(){
            System.out.println("B class is called");
        }
    }
    public class casting {
        public static void main(String[] args) {
            A obj=new B(); //upcasting in typecasting
            obj.show1();
            B obj1=(B) obj;//Downcasting  in typecasting
            obj1.show1();
    }
    
}
