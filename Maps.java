import java.util.*;
public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> name=new hashmap<>();
        name.put("koushik", 75);
        name.put("Ramesh",45);
        name.put("Rithvik",80);
        name.put("Ramcharan",77);
        for(String key:name.keySet()){
            System.out.println(key+": "+name.get(key));
        }
        
        
    }
    
}
