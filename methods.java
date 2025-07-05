class Computer{
    public void play(){
        System.out.println("Play Music....");
    }
    public int sum(int n1,int n2){
       return n1+n2;
    }
    public String pen(){
       int  cost=sum(6,1);
        if(cost>=10)
           return " Hey! you got pen";
        return "nothing....";
    }
}
public class methods {
    public static void main(String[] args) {
    // obj.var1=15;
    // obj.var2=45;     
    Computer action=new Computer();
    action.play();
    String result=action.pen();
    System.out.println(result);
    
    }
}
