import java.util.*;
public class Practise{
    public static void main(String[]args){
        int[] arr={2,2,3};
        run(arr);
    }
    static void run(int[] arr){
        Arrays.sort(arr);
       int start=0;
       int end=1;
       while (end<arr.length) {
        if(end<arr.length && arr[start]==arr[end]){
            start=start+2;
            end=end+2;
        }
        break;
       }
       System.out.println(arr[start]);
    }
}