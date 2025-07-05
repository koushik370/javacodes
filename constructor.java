class Human{
    private  String name;
    private  int age;

public Human(){   //default constructor
    name="koushik";
    age=18;
}
public int getAge(){  
    return age;
}
public String getName(){
    return name;
}
public Human(int age,String name){  //parameterized constructor 
    this.age=age;
    this.name=name;
}
}
public class constructor {
    public static void main(String[] args) {
        Human obj=new Human();
        Human obj1=new Human( 16,"rithvik");
       System.out.println(obj.getName()+" "+obj.getAge());
        System.out.println(obj1.getAge()+" "+obj1.getName());   
    }   
}
