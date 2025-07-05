public class whilee {
    public static void main(String args[]){
        int i=1;

        while(i<=4){  //while loop in java
            System.out.println("Hello java"+i);
            int j=1;
            while (j<2) {
                System.out.println("Namestay"+j); //nested loop in java
                ++j;
                
            }
            i++;
        }
    }
    
}
