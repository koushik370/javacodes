 final class A{ //by adding final before the class we can stop  the  multi level inheritance 
    public void show(){
        System.out.println("iam koushik");
    }
    public final  int show(int a,int b){//by adding fial before the method we can stop using it again
        return a+b;
    }
}
class D extends A{  
    public void show(){
        System.out.println("iam john");
    }
    public int show(int a,int b){
        return a+b;
    }
}



public class finall{
    public static void main(String[] args) {
        final int num=10;
        //final keyword is used to make variable constant ...after asigning it will not change to other value
       // System.out.println(num);
        D obj=new D();
        //obj.show(1,5);
        obj.show();
        System.out.println(obj.show(1,5));
    }
}