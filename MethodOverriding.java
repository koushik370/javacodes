class Cal{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class AdvCal extends Cal{
    public int add(int n1,int n2){
        return n1+n2+2;
    }
}
public class MethodOverriding {
      public static void main(String[] args) {
         AdvCal obj=new AdvCal();
        int r= obj.add(1,2);
         System.out.println(r);
      }
}
