import java.util.*;
public class Sorting {
    public static void main(String[] args) {

        Comparator<String> cum=new Comparator<String>() {

            public int compare(String i,String j){
                            if(i.length() < j.length()){
                                return 1;
                            }
                            else 
                               return -1;
                        }
        };
        List<String> num=new ArrayList<String>();
        num.add("koushik");
        num.add("Ramcharan");
        num.add("Rithvik");
        num.add("Srikanth");
        num.remove(0);
        for(String n : num){
            System.out.println(n+" ");
        }
        Collections.sort(num,cum);
        System.out.println(num.get(0));
     
    }
    
}
