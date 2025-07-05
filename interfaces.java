//class to class->extends
//interface to class -> implement
//interface to interface ->extends
interface  A{
     void drive(); //public abstract...
     void name();  
}
interface X{
    int age=18;   //final and static...
    String place="Bhupalapally";
}
class B implements A,X{
    public void drive(){
        System.out.println("can drive");
    }
    public void name(){
        System.out.println("Koushik here!");
    }
}
public class interfaces {
    public static void main(String[] args) {
        A obj;
        obj=new B();
        obj.drive();
        obj.name();
        
        System.out.println(X.age+" "+X.place);
    }
    
}
