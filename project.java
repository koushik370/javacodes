//Guess the number ....

import java.util.Scanner;
class A{
      int guess;
      int number=(int)(Math.random()*100);
      int chances=5;
    }
public class project{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A obj=new A();
        for(int i=0;i<obj.chances;i++){
            System.out.print("enter your guess number: ");
             obj.guess=sc.nextInt();
            if(obj.number>obj.guess && obj.chances-1!=i){
                System.out.println("Your number is less than the actual number");
            }
            else if(obj.number<obj.guess  && obj.chances-1!=i){
               System.out.println("Your number is greater than the actual number");
            }
            else if(obj.number==obj.guess){
                     System.out.println("Hey congajulation you won the game");
                     break;
            }
            else{
                System.out.println("Your chances are completed ! try again");
                System.out.println("The actual number is "+obj.number);
            }
            
        }
    }
}