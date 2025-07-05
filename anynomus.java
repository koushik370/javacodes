class A{
    public A(){
        System.out.println("A is called");
    }
    public void Show(){
        System.out.println("show called");
    }

}




public class anynomus {
    public static void main(String[] args) {
         new A().Show(); //anonymous object...
        //By creating anonymous object we cannot use the object once more i.e if we call the object it 
        //it creates another object which is not support reuse
    

    
    }
    
}
