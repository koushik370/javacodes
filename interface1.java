interface Computer{
    void code();
}
class Desktop implements Computer{
    public void code(){
        System.out.println("coding in faster mode");
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code , compile , run");
    }
}
class Developer {
    public void operate(Computer lap){
        lap.code();
    }
}
public class interface1 {
    public static void main(String[] args) {
       Computer lap=new Laptop();
       Computer desk=new Desktop();
       Developer koushik=new Developer();
       koushik.operate(lap);
    }
}
