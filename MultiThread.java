class A extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hi.");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hello.");
        }   
    }
}
public class MultiThread {
    public static void main(String[] args) {
         A obj1=new A();
         B obj2=new B();
   //      obj2.setPriority(Thread.MAX_PRIORITY);
         obj1.start();
         try{
            Thread.sleep(1);
         }
         catch(InterruptedException e){
             System.out.println("error ocuured "+e);
         }
         obj2.start();
        
    }
    
}
