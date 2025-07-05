public class PrefixSuffix{
    public static void main(String[] args) {
        String a="abdef";
        String b="fecab";
      boolean job=  run(a, b);
      System.out.println(job);
    }
    static boolean run(String a,String b){
        int start=0;
        int end=a.length();
        for(int i=1;i<Math.min(a.length(), b.length()-1);i++){
             String prefix1=a.substring(start,i);
             String suffix1=a.substring(i+1,end);
           //  System.out.println(prefix1+" "+suffix1);
           String prefix2=b.substring(start,i);
           String suffix2=b.substring(i+1,end);
         //  System.out.println(prefix2+" "+suffix1);
         String ans1=prefix1+suffix2;
         String ans2=prefix2+suffix1;
         int first=0;
         int second=ans1.length()-1;
         boolean solution=false;
         while (first<second) {
            if(ans1.charAt(first)==ans1.charAt(second)){
                first++;
                second--;
                solution=true;
            }
            else{
                first++;
                second--;
            }
         }
         boolean solution1=false;
         while (first<second) {
            if(ans2.charAt(first)==ans2.charAt(second)){
                first++;
                second--;
                solution=true;
            }
            else{
                first++;
                second--;
            }
         }
         if(solution==true || solution1==true){
            return true;
         }
         }
         if(a.length() ==1 || b.length()==1){
            return true;
         }     
         return false; 
    }
}
