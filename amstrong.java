import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value: "); //153
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while (num!=0) {
            int count=num%10;
            sum=sum+count*count*count;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("number is amstrong");
        }
       else{
        System.out.println("is not a amstrong number");
    }
       }
}
