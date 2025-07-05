public class Prime {
    public static void main(String[] args) {
        int num=1;
        int i=2;
        int count=0;
       while (i!=num) {
         if(num%i==0){
            count=count+1;
            break;
         }
         i++;
       }
       if(num==1){
        System.out.println("it is nor prime or composite number");
       }
       if(count>0){
        System.out.println("number is not a prime");
       }
       else{
        System.out.println("number is a prime number");
       }
        }
    }

