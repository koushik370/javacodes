
public class RunableThread {
    public static void main(String[] args) {
        Runnable obj1=()->
        {
            
            for( int i=0;i<5;i++){
                System.out.println("hii");
            }
            try{
                Thread.sleep(15);
            }
            catch(Exception e){
                System.out.println("Error occured");
            }
        };
        Runnable obj2=()->{
            for( int i=0;i<5;i++){
                System.out.println("hello");
            }
            try{
                Thread.sleep(5);
            }
            catch(Exception e){
                System.out.println("Error occured");
            }
         
        };
        Thread r1=new Thread(obj1);
        Thread r2=new Thread(obj2);
        r1.start();
        r2.start();
    }
    
}
