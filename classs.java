class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
    public int mul(int n1,int n2 ){
        return n1*n2;
    }
}
public class classs {
    public static void main(String[] args) {
        int num1=5;
        int num2=6;
        Calculator cal=new Calculator();
        int result=cal.sub(num1,num2);
        System.out.println(result);

    }
    
}
