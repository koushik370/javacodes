@FunctionalInterface
interface A{
    int show(int x,int y);
}
public class Lamda {
    public static void main(String[] args) {
        A obj=(x,y)->x+y;
       int result= obj.show(5,9);
       System.out.println(result);
        
    }
    
}
