public class Finally{
    public static void main(String[] args) {
        int i=2;
        int j=0;
        try{
            j=13/i;
           // System.out.println("Bye ");

        }
        finally{

            System.out.println("Iam in the final block");
        }
    }
}