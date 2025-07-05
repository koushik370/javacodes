interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
       System.out.println("compile run");
    }
    }
class Desktop implements Computer{
    public void code(){
        System.out.println("compile run faster");
    }
}
class Developer{
    public void devapp(Computer lap){
        lap.code();
    }
}
public class needinterface {
  public static void main(String[] args) {
     Computer desk=new Desktop();
     Computer lap=new Laptop();
     lap.code();
     Developer koushik=new Developer();
     koushik.devapp(lap);
  }
    
}