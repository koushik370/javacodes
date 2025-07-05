class laptop{
    String name;
    @Override
    public String toString() {
        return "laptop [name=" + name + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        laptop other = (laptop) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    int price;
}
public class equal {
    public static void main(String[] args) {
        laptop obj1=new laptop();
        obj1.name="lenovo";
        obj1.price=55000;
        laptop obj2=new laptop();
        obj2.name="lenovo";
        obj2.price=5500;

        System.out.println(obj1.equals(obj2));

        
        
    }
    @Override
    public String toString() {
        return "equal []";
    }
    
}
