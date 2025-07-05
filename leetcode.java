import java.util.*;
public class leetcode {
    public static void main(String[] args) {
        int[] nums={-1,1,0,-3,3};
        run(nums);
    }
    static void run(int[] nums){
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int mul=1;
            for(int j=0;j<nums.length;j++){
               if(nums[j]==nums[i]){
                continue;
               }
               else{
                mul=mul*nums[j];
               }
            }
           ar.add(mul);
        }
        for(int n : ar){
            System.out.println(n);
        }
    }
}
