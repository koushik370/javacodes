class Info{
   static String name;
   int price;
   String brand;
   static{
     name="koushik";
   // System.out.println("static block");
   }
    public void Shows(){
        System.out.println(name+" "+brand+" "+price);

       // System.out.println("constructer block");

    } 
}
public class static_vairable {
    public static void main(String[] args) {
        Info obj1=new Info();
        obj1.price=2000;
       // Info.name="rithvik";
        obj1.brand="anroid";
        Info obj2=new Info();
        obj2.price=6000;
        
        obj2.brand="Mac";
        
        obj1.Shows();
        obj2.Shows();
    }
    
}
