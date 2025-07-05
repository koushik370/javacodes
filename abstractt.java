abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing music");
    }
}

class Maruti extends Car{  //concurent class : taking the abstract class and defining it in this class
    public void drive(){
        System.out.println("Yah i can drive");
    }
    public void Wheel(){
        System.out.println("4 wheeler");
    }
 }
public class abstractt {
   public static void main(String[] args) {
    Maruti obj=new Maruti();
    obj.Wheel();
    obj.drive();
    obj.playMusic();
    
   }
    
}
