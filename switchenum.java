enum Status{
    Running,Pending,Getting,Rejected;
}
public class switchenum {
    public static void main(String[] args) {
        Status s=Status.Rejected;

        switch (s) {
            case Getting:
                System.out.println("Please wait");
                break;
            case Pending:
                System.out.println("Its pending...");
                break;
            case Running:
                 System.out.println("Getting the result...");
                 break;
            case Rejected:
                System.out.println("OOPs it got rejected");
                break;
        
            default:
               System.out.println("Done...");
                break;
        }
        
    }
    
}
