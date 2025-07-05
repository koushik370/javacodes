public class fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
            for(int i=0;i<=60;i++){
                c=a+b;
                a=b;
                b=c;
                System.out.println("The fibonacci series is :"+c);
            }
        }
    }
    

