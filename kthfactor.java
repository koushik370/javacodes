import java.util.*;
public class kthfactor {
    public static void main(String[] args) {
        int n=4;
        int k=4;
        run(n, k);

    }
    static int run(int n ,int k){
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ar.add(i);
            }
        }
       int[] key=new int[ar.size()];
       int i=0;
       for(int m : ar){
        key[i]=m;
        i++;
       }
       if(key.length<k){
        return (-1);
       }
       else{
        return (key[k-1]);
       }

    }
}
