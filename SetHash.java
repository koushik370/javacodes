import java.util.*;
class Students{
    int age;
    String name;
    @Override
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
        
    }
}
public class SetHash{
    public static void main(String[] args) {
        Comparator<Students> cum=new Comparator<Students>() {
            public int compare(Students i,Students j){
                if(i.name.length() > j.name.length()){
                    return 1;
                }
                else 
                   return -1;
            }
        };
    
         List<Students> nums=new ArrayList<Students>();
           nums.add(new Students(15,"koushik"));
           nums.add(new Students(20, "Rithvik"));
           nums.add(new Students(21, "Srikanth"));
          Collections.sort(nums,cum);
          for(Students n:nums){
            System.out.println(n);
          }
        }
    }
