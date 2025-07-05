class koushikexception extends Exception{
    public koushikexception(String error){
        super(error);
    }
}
public class CustomException{
    public static void main(String[] args) {
        int i=0;
        int j=15;
        int ans=0;
        try{
             ans=i/j;
             if(ans==0){
                throw new koushikexception("its my exception");
             }

        }
        catch(koushikexception e){
               System.out.println(e);
        }
    }
}