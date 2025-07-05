class A{
    int count;
    public synchronized void  increment(){ //it makes the thread avoid executing simulternsoly
        count++;
    }
}
public class SynchrozedThread {
    public static void main(String[] args) throws InterruptedException {
        A obj=new A();
        Runnable obj1=()->{
            for(int i=0;i<1000;i++){
                obj.increment();
            }
        };
        Runnable obj2=()->{
            for(int i=0;i<1000;i++){
                obj.increment();
            }
        };
        Thread sc=new Thread(obj1);
        Thread sm=new Thread(obj2);
        sc.start();
        sm.start();
        sc.join();
        sm.join();

        System.out.println(obj.count);
        

        
    }
    
}
