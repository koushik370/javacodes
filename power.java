import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class power{
    public static void main(String[] args) {
     int n=0;
     boolean ans=demo(n);
     System.out.println(ans);
  
    }
    static boolean demo(int n){
     for(int i=0;i<n;i++){
      if(Math.pow(4, i)==n){
          return true;
      }
     }
     return false;
     }
    }
    