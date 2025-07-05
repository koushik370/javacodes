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
public class Comparable {
    public static void main(String[] args) {
        Comparator<Students> cum=new Comparator<Students>() {
            public int compare(Students i,Students j){
                if(i.age > j.age){
                    return 1;
                }
                else 
                   return -1;  /*  Comparator<Students> cum =(i,j)-> {
                                    return i.age>j.age?1:-1;
                                         }; we can also use this as comparator is a functional interface */
            }
        };
        List<Students> stud=new ArrayList<Students>();
        stud.add(new Students(20,"koushik"));
        stud.add(new Students(22,"Ramcharan"));
        stud.add(new Students(21,"Srikanth"));
        stud.add(new Students(18,"Rithvik"));
        Collections.sort(stud,cum);
        for(Students s:stud){
            System.out.println(s);
        }

        
    }
    
}
