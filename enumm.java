enum Laptop{
    HP(45000),Lenovo(52000),Vector(51000);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class enumm{
    public static void main(String[] args) {
        for(Laptop lap:Laptop.values()){
            System.out.println(lap+" "+lap.getPrice());
        }
    }
}