public class slicing {
    public static void main(String[] args) {
        int x=20;
        int y=30;
        int c=x;
        x=y;
        y=c;

        System.out.println("x is :"+x);
        System.out.println("y is "+y);
    }
}
