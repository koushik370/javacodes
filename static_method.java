class Info{
    static String name;
    int price;
    int rating;
    static{
        name="koushik";
    }
   public static void Show(Info obj){
       System.out.println(name+" "+obj.price+" "+" "+obj.rating);
   }
   public void Display(){
    //System.out.println(name+" "+price+" "+rating);
   }

}
public class static_method {
    public static void main(String[] args) {
        Info obj=new Info();
        obj.price=1200;
        obj.rating=4;
        Info.Show(obj);       
    }
}
