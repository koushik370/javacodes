import java.math.BigInteger;

public class Stringmultiplication {
    public static void main(String[] args) {
        String num1="123";
        String num2="456";
        run(num1, num2);
    }
    static void run(String num1,String num2){
        BigInteger bg1=new BigInteger(num1);
        BigInteger bg2=new BigInteger(num2);
        BigInteger ans=bg1.multiply(bg2);
        System.out.println(ans);
    }
}
