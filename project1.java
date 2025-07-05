interface Vechile{
    void ChangeGare(int a);
    void SpeedUP(int b);
    void applybreaks(int b);
}
class Cycle implements Vechile{
    int gare;
    int speed;
    public void ChangeGare(int x){
        gare=x;
    }
    public void SpeedUP(int increment){
        speed=increment+speed;
    }
    public void applybreaks(int decrement){
        speed=speed-decrement;
    }
    public void State(){
        System.out.println("Iam driving a cycle at "+gare+" gare and speed of the cycle is :"+speed);
    }
}
class Bike implements Vechile{
    int gare;
    int speed;
    public void ChangeGare(int x){
        gare=x;
    }
    public void SpeedUP(int increment){
        speed=increment+speed;
    }
    public void applybreaks(int decrement){
        speed=decrement-speed;
    }
    public void State(){
        System.out.println("Iam driving a Bike at "+gare+" gare and speed of the cycle is :"+speed);
    }
}
public class project1{
    public static void main(String[] args) {
        Bike obj=new Bike();
        Cycle obj1=new Cycle();
        obj.ChangeGare(2);
        obj.SpeedUP(15);
        obj.State();
        obj1.ChangeGare(3);
        obj1.SpeedUP(60);
        obj1.applybreaks(10);
        obj1.State();
    }
}