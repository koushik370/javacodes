class Additon{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
}



public class methodoverloading {
    public static void main(String[] args) {
        Additon obj=new Additon();
        int result=obj.add(4,5,6);
        System.out.println(result);

    }
//methodoverloading means we can pass any number of parameters without changing the method name



    
}
