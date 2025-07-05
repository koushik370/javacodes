/*try catch method is mainly used for handling the exception so,we can stop code stopping we it find
 * error and print remaining code output...
  */

public class trycatch {
    public static void main(String[] args) {
        int j=0;
        int i=0;
        String nums[]=new String[5];
        String name=null;
        try{
             j=6/i;
             System.out.println(nums[5]);
             System.out.println(name.length());
        }
        catch(ArithmeticException e){
            System.out.println("Airthmetic Exception"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your Limit"+e);
        }
        catch(Exception e){
            System.out.println("Hey be carefull"+e);
        }
        System.out.println("Iam out of exceptions");
    }

    
}
