class Human{
    private String name;
    private int age;

     void setName( String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        
        Human obj=new Human();
        obj.setAge(18);
        obj.setName("koushikk");
        System.out.println(obj.getName()+" "+obj.getAge());
        
    }
    
}
